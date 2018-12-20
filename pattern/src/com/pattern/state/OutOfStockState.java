package com.pattern.state;

public class OutOfStockState implements State {

	public void insertOneDollar(VendingMachine m) {
		System.out.println("OutOfStock: insert 1 dollar! Nothing there!");
		ejectMoney(m);
	}
	public void ejectMoney(VendingMachine m) {
		System.out.println("OutOfStock: eject money! no");
	}
	public void dispense(VendingMachine m) {
		System.out.println("OutOfStock: no product!");
	}

}
