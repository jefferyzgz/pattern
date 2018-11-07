package com.pattern.chainofresponsibility;

public interface RequestHandler {

	public void processRequest(File file);
	public void setNextHandler(RequestHandler handler);
	public String getHandlerName();
}
