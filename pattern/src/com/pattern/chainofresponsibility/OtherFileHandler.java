package com.pattern.chainofresponsibility;

public class OtherFileHandler implements RequestHandler {

	private RequestHandler nextHandler;
	@Override
	public void processRequest(File file) {
		if(file == null) {
			System.out.println("file is empty");
		} else if(file.getExtName().equals("txt") || file.getExtName().equals("doc")) {
			System.out.println("processing Other type files:"+file.getName());
		} else {
			this.nextHandler.processRequest(file);
		}

	}

	@Override
	public void setNextHandler(RequestHandler handler) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getHandlerName() {
		// TODO Auto-generated method stub
		return null;
	}

}
