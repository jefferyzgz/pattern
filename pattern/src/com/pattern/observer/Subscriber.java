package com.pattern.observer;

public class Subscriber implements Observer {
	private String name;
	private String content;
	
	public Subscriber(String name) {
		this.name = name;
	}

	@Override
	public void update(String content) {
		// Subject was updated, subscriber need to check the content
		this.content = content;
		display();
	}
	
	private void display() {
		System.out.println(name + " got new content:" + content);
	}

	@Override
	public String getName() {
		return name;
	}

}
