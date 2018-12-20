package com.pattern.state;

public class TestStatePattern {
	public static void main(String[] args) {
		VendingMachine m = new VendingMachine(2);
		m.dispense();
		m.insertOneDollar();
		m.ejectMoney();
		m.insertOneDollar();
		m.dispense();
		m.insertOneDollar();
		m.dispense();
		m.insertOneDollar();
		m.dispense();
				
	}
}
