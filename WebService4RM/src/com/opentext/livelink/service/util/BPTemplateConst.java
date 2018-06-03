package com.opentext.livelink.service.util;

import java.util.ArrayList;
import java.util.List;

public enum BPTemplateConst {

	AGENT_PROFILE_INFORMATION(1,"01 Agent Profile Information",42372),
	NSL_AGENT_CORRESPONDENCE(2,"02 NSL-Agent Correspondence",42406),
	COSTOMER_CORRESPONDENCE(4,"04 Customer Correspondence",42403),
	EMPOYEE_CORRESPONDENCE(6,"06 Employee Correspondence",42428),
	BROKER_AND_FNINANCIAL_ADVISOR_CORRESPONDENCE(7,"07 Broker and Financial Advisor Correspondence",42391),
	RELATED_CANDIDATE_BP_WORKSPACES(0,"Related Candidate BP Worksapces",42376);
	
	
	private int type;
	private String folderName;
	private long nodeId;
	
	BPTemplateConst(int type,String folderName,long nodeId ){
		this.type = type;
		this.folderName = folderName;
		this.nodeId = nodeId;
	}
	
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getFolderName() {
		return folderName;
	}
	
	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}

	public long getNodeId() {
		return nodeId;
	}
	
	public void setNodeId(long nodeId) {
		this.nodeId = nodeId;
	}

	public static List<Integer> getTypes(){
		List<Integer> list = new ArrayList<Integer>();
		for(BPTemplateConst con:BPTemplateConst.values()){
			list.add(con.getType());
		}
		return list;
	}
	
	public static String getValue(int type){
		if(!getTypes().contains(type))
			return null;
		for(BPTemplateConst con:BPTemplateConst.values()){
			if(con.getType()==type)
				return con.getFolderName();
		}
		return null;
	}
	
	public static Long getNodeId(int type){
		if(!getTypes().contains(type))
			return null;
		for(BPTemplateConst con:BPTemplateConst.values()){
			if(con.getType()==type)
				return con.getNodeId();
		}
		return null;
	}
	
	public static BPTemplateConst getTemplate(int type){
		if(!getTypes().contains(type))
			return null;
		for(BPTemplateConst con:BPTemplateConst.values()){
			if(con.getType()==type)
				return con;
		}
		return null;
	}
}
