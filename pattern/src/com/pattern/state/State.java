package com.pattern.state;

public interface State {
	public void insertOneDollar(VendingMachine m);
	public void ejectMoney(VendingMachine m);
	public void dispense(VendingMachine m);
}
