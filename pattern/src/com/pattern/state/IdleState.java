package com.pattern.state;

public class IdleState implements State {

	public void insertOneDollar(VendingMachine m) {
		System.out.println("Idle: insert 1 dollar!");
		m.setState(m.getHasOneDollarState());
	}
	public void ejectMoney(VendingMachine m) {
		System.out.println("Idle: no money to eject!");
	}
	public void dispense(VendingMachine m) {
		System.out.println("Idle: no money no dispense !");
	}
}
