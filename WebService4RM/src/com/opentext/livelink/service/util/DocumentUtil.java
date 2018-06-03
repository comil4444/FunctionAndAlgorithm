package com.opentext.livelink.service.util;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.log4j.Logger;

import com.nsl.cs.util.OTAuthenticationPool;
import com.nsl.cs.ws.ReadConfigFile;
import com.opentext.livelink.service.core.Authentication;
import com.opentext.livelink.service.core.Authentication_Service;
import com.opentext.livelink.service.docman.AttributeSourceType;
import com.opentext.livelink.service.docman.CopyOptions;
import com.opentext.livelink.service.docman.DocumentManagement;
import com.opentext.livelink.service.docman.DocumentManagement_Service;
import com.opentext.livelink.service.docman.Node;
import com.opentext.livelink.service.docman.NodeRight;
import com.opentext.livelink.service.docman.NodeRights;

public class DocumentUtil {
	
	private static String prefix = "eric test:";
	public final static int BP_TEMPLATE_ROOT_NODE = 42360;
	public final static String AUTHENTICATION = "Authentication?wsdl";
	public static final String WSDL_URL_DOCUMENTMANAGEMENT = "DocumentManagement?wsdl";
	private final static Logger logger = Logger.getLogger(OTAuthenticationPool.class);
	private static String connectAs = "";
	private static String passWord = "";
	private static String authWSDLString = "";
	
	static{
		ReadConfigFile config =  ReadConfigFile.getInstance();
		try {
			connectAs = config.getUserName();
			passWord = config.getPassword();
			authWSDLString = config.getWebserviceECMURL();
			logger.info(prefix+connectAs+"---"+passWord);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updatePermission(List<NodeRight> originList,List<Node> nodes,DocumentManagement dm){
		logger.info(prefix+"updatePermission");
		if(nodes!=null){
			for(Node node:nodes){
				List<NodeRight>targetList = dm.getNodeRights(node.getID()).getACLRights();
				//update
				for(NodeRight right:originList){
					logger.info(prefix+"origin:"+right.getRightID()+"--"+right.getType());
					if(!targetList.contains(right)){
						dm.addNodeRight(node.getID(), right);
					}else{
						dm.updateNodeRight(node.getID(), right);
					}
				}
				
				for(NodeRight right:targetList){
					if(!originList.contains(right))
						dm.removeNodeRight(node.getID(), right);
				}
				updatePermission(originList, dm.listNodes(node.getID(), true), dm);
			}
		}
	}
	
	/*
	 * @param	bpNo	folderName in ECM
	 * @param	type	refer to BPTemplateConst
	 * 
	 * @return if copy work is successfully execute.
	 */
	
	public boolean copyTemplateFolder(String bpNo,int type){
		/*
		 * 通過NodeRootID和BP確認是否BP創建在ECM
		 * 如果沒有直接返回false
		 * 如果有
		 * 		根據type來判斷是否有target folder,如果有則返回，如果沒有則copy
		 */
		logger.info(prefix+bpNo+"--"+type+"begin");
		
		DocumentManagement dm = null;
		try {
			dm = getOuth();
		} catch (Throwable e) {
			e.printStackTrace();
			logger.info(e.getMessage());
		}
		
		Node bpObj = null;
		try {
			//use root node id and foldername to check whether the bp is built successfully
			//bpObj = ECMOperations.getInstance().checkFolderExists(BP_TEMPLATE_ROOT_NODE, bpNo,"");
			bpObj = dm.getNodeByName(BP_TEMPLATE_ROOT_NODE, bpNo);
			logger.info(prefix+bpNo+"--"+type+" Root:bpObj:"+bpObj);
			if(null==bpObj||!BPTemplateConst.getTypes().contains(type)){
				return false;
			}
			
			String folderName = BPTemplateConst.getValue(type);
			//long folderObj = ECMOperations.getInstance().checkFolderExists(bpObj, folderName,"");
			Node folderObj =dm.getNodeByName(bpObj.getID(), folderName);
			
			logger.info(prefix+bpNo+"--"+type+"folderObj:"+folderObj==null?"":folderObj.getID());
			if(null == folderObj){
				copyNodeAndPermission(BPTemplateConst.getTemplate(type),bpObj.getID(),dm);
				logger.info(prefix+bpNo+"--"+type+"end");
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			return false;
		}
		return false;
	}


	private void copyNodeAndPermission(BPTemplateConst template, long targetParentId,DocumentManagement dm) {
		
		CopyOptions copyOptions = new CopyOptions();
		copyOptions.setAddVersion(false);
		copyOptions.setCopyCurrent(false);
		copyOptions.setCurrentUserAsOwner(false);
		copyOptions.setKeepReservedState(false);
		copyOptions.setKeepVersionLocks(false);
		copyOptions.setAttrSourceType(AttributeSourceType.ORIGINAL);
		
		NodeRights nrs = dm.getNodeRights(template.getNodeId());
		List<NodeRight> originList = nrs.getACLRights();
		
		Node node = dm.copyNode(template.getNodeId(), targetParentId, template.getFolderName(), copyOptions);
		
		List<Node> testList =  new ArrayList<Node>();
		testList.add(node);
		logger.info(prefix+"node="+node);
		updatePermission(originList,testList, dm);
	}

	private DocumentManagement getOuth() throws Throwable {
		logger.info(prefix+"copyNodeAndPermission");
		Authentication_Service as = new Authentication_Service(new URL(authWSDLString+AUTHENTICATION),new QName("urn:Core.service.livelink.opentext.com", "Authentication"));
		logger.info(as.getWSDLDocumentLocation());
		Authentication auth = as.getBasicHttpBindingAuthentication();
		
		logger.info(prefix+connectAs+":"+passWord);
		String token = auth.authenticateUser(connectAs, passWord);
		
		logger.info(prefix+"token="+token);
		
		DocumentManagement_Service ds = new DocumentManagement_Service(new URL(authWSDLString+WSDL_URL_DOCUMENTMANAGEMENT),new QName("urn:DocMan.service.livelink.opentext.com", "DocumentManagement")); 
		
		ds.setHandlerResolver(new HeaderHandlerResolver(token));
		DocumentManagement dm = ds.getBasicHttpBindingDocumentManagement();
		return dm;
	}
	
}
