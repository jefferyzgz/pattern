package com.pattern.state;

public class VendingMachine {

	private State currentState;
	
	private State idleState;
	private State hasOneDollarState;
	private State outOfStockState;
	
	private int count;
	
	public void setState(State s) {
		this.currentState = s;
	}
	
	public State getIdleState() {
		return this.idleState;
	}
	
	public State getHasOneDollarState() {
		return this.hasOneDollarState;
	}
	
	public State getOutOfStockState() {
		return this.outOfStockState;
	}
	
	public VendingMachine(int count) {
		idleState = new IdleState();
		hasOneDollarState = new HasOneDollarState();
		outOfStockState = new OutOfStockState();
		
		if(count > 0) {
			this.currentState = idleState;
			this.count = count;
		} else {
			this.currentState = outOfStockState;
			this.count = 0;
		}
	}
	
	public void returnMoney() {
		System.out.println("Machine return money!");
	}
	
	public void releaseProduct() {
		System.out.println("Machine relseas product!");
		this.count--;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public void insertOneDollar() {
		currentState.insertOneDollar(this); 
	}
	
	public void ejectMoney() {
		currentState.ejectMoney(this);
	}
	
	public void dispense() {
		currentState.dispense(this);
	}
}
