package com.pattern.chainofresponsibility;

public class File {
	private String name;
	private String extName;
	private String content;	
	public File(String name, String extName, String content) {
		this.name = name;
		this.extName = extName;
		this.content = content;
	}
	public String getExtName() {
		return extName;
	}
	public void setExtName(String extName) {
		this.extName = extName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}