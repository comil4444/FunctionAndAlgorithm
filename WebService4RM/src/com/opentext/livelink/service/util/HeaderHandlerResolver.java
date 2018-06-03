package com.opentext.livelink.service.util;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

public class HeaderHandlerResolver implements HandlerResolver {
	
	private String tokenString = "";
	
	public HeaderHandlerResolver(String token){
		this.tokenString = token;
	}

	@SuppressWarnings("rawtypes")
	public List<Handler> getHandlerChain(PortInfo portInfo) {
		List<Handler> handlerChain = new ArrayList<Handler>();

		SOAPHeaderCWSHandler hh = new SOAPHeaderCWSHandler(tokenString);

		handlerChain.add(hh);

		return handlerChain;
	}
}