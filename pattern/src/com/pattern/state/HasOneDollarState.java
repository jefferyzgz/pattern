package com.pattern.state;

public class HasOneDollarState implements State {

	public void insertOneDollar(VendingMachine m) {
		System.out.println("OndDollar: insert one again! Do not need!");
		m.returnMoney();
	}
	public void ejectMoney(VendingMachine m) {
		System.out.println("OndDollar: eject money! Don't want to buy!");
		m.returnMoney();
		m.setState(m.getIdleState());
	}
	public void dispense(VendingMachine m) {
		System.out.println("OndDollar: release product! Sure!");
		
		if(m.getCount() > 1) {
			m.releaseProduct();
			m.setState(m.getIdleState());
		} else {
			m.releaseProduct();
			m.setState(m.getOutOfStockState());
		}
	}

}
