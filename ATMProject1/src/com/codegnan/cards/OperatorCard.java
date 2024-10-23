package com.codegnan.cards;

import com.codegnan.customExceptions.InSuffientBalanceException;
import com.codegnan.customExceptions.InSuffientMachineBalanceException;
import com.codegnan.customExceptions.InvalidAmountException;
import com.codegnan.customExceptions.NotAOperatorException;
import com.codegnan.interfaces.IATMService;

public class OperatorCard implements IATMService{
private int pinNumber;
private long id;
private String name;
private final String type="operator";
	public OperatorCard(int pinNumber, long id, String name) {
	
	this.pinNumber = pinNumber;
	this.id = id;
	this.name = name;
}

	@Override
	public String getUserType() throws NotAOperatorException {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public double withdrawAmount(double withAmount)
			throws InvalidAmountException, InSuffientBalanceException, InSuffientMachineBalanceException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void depositAmount(double dptAmount) throws InvalidAmountException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double checkAccountBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void changePinNumber(int pinNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPinNumber() {
		// TODO Auto-generated method stub
		return pinNumber;
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void decreaseChances() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getChances() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void resetPinNumber() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateMINIStatement() {
		// TODO Auto-generated method stub
		
	}
	

}
