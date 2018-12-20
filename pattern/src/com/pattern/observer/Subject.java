package com.pattern.observer;

import java.util.ArrayList;

public class Subject {
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void register(Observer subscriber) {
		observers.add(subscriber);
		System.out.println(subscriber.getName() + " registered successfully!");
	}
	
	public void unregister(Observer subscriber) {
		observers.remove(subscriber);
		System.out.println(subscriber.getName() + " unregistered successfully!");
	}
	
	public void notifySubscribers(String content) {
		if(observers == null || observers.size() == 0) {
			System.out.println("No subscriber!");
		} else {
			for(Observer o : observers) {
				o.update(content);
				System.out.println("Notify subscriber " + o.getName());
			}
		}
	}
}
