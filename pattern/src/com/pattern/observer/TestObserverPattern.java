package com.pattern.observer;

public class TestObserverPattern {

	public static void main(String[] args) {
		Subscriber s1 = new Subscriber("s1");
		Subscriber s2 = new Subscriber("s2");
		Subscriber s3 = new Subscriber("s3");
		
		Blog myblog = new Blog();
		myblog.register(s1);
		myblog.register(s2);
		myblog.register(s3);
		
		myblog.notifySubscribers("First blog!");
		
		myblog.unregister(s3);
		
		myblog.notifySubscribers("Second blog!");
	}
}
