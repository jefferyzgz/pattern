package com.pattern.chainofresponsibility;

public class DocHandler implements RequestHandler {

	private RequestHandler nextHandler;
	
	@Override
	public void processRequest(File file) {
		if(file == null) {
			System.out.println("file is empty");
		} else if(file.getExtName().equals("txt") || file.getExtName().equals("doc")) {
			System.out.println("processing Doc:"+file.getName() + ", by " + this.getHandlerName());
		} else {
			this.nextHandler.processRequest(file);
		}
	}

	@Override
	public void setNextHandler(RequestHandler handler) {
		this.nextHandler = handler;
	}

	@Override
	public String getHandlerName() {
		return "DocHandler";
	}

}
