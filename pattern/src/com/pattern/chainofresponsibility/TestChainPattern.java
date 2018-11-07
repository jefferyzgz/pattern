package com.pattern.chainofresponsibility;

public class TestChainPattern {

	public static void main(String[] args) {
		File file = null;
		RequestHandler docHandler = new DocHandler();
		RequestHandler imageHandler = new ImageHandler();
		
		docHandler.setNextHandler(imageHandler);
		
		file = new File("novel", "txt", "This a novel");
		docHandler.processRequest(file);
		
		file = new File("portrait", "jpg", "Mona Lisa");
		docHandler.processRequest(file);
	}
}
