package com.pattern.chainofresponsibility;

public class ImageHandler implements RequestHandler {

private RequestHandler nextHandler;
	
	@Override
	public void processRequest(File file) {
		if(file == null) {
			System.out.println("file is empty");
		} else if(file.getExtName().equals("jpg") || file.getExtName().equals("jpeg")) {
			System.out.println("processing Image:"+file.getName() + ", by " + this.getHandlerName());
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
		return "ImageHandler";
	}

}
