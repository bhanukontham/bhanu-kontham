package com.codegnan.cards;

import java.util.ArrayList;
import java.util.Collections;

import com.codegnan.customExceptions.InSuffientBalanceException;
import com.codegnan.customExceptions.InSuffientMachineBalanceException;
import com.codegnan.customExceptions.InvalidAmountException;
import com.codegnan.customExceptions.NotAOperatorException;
import com.codegnan.interfaces.IATMService;

public class AxisCard implements IATMService {
	String name;
	long debitCardNumber;
	double accountBalance;
	int pinNumber;
	ArrayList<String> statement;
	final String type="user";
	int chances;


	public AxisCard(String name, long debitCardNumber, double accountBalance, int pinNumber) {
		chances=3;
		this.name = name;
		this.debitCardNumber = debitCardNumber;
		this.accountBalance = accountBalance;
		this.pinNumber = pinNumber;
		statement=new ArrayList<>();
	}

	@Override
	public String getUserType() throws NotAOperatorException {
		
		return type;
	}

	@Override
	public double withdrawAmount(double withAmount)
			throws InvalidAmountException, InSuffientBalanceException, InSuffientMachineBalanceException {
	if(withAmount<=0) {
		throw new InvalidAmountException("you can enter Zero(0) amount to withdaraw. please enter valid amount");
	}else if(withAmount!=0) {
		throw new InSuffientBalanceException("please withdraw multiples of 100");
	}else if(withAmount>accountBalance) {
		throw new InSuffientBalanceException("you don't have enough funds to withdraw...please check your balance");
	}else {
		accountBalance=accountBalance-withAmount;
		statement.add("debited:"+withAmount);
				}
		return withAmount ;
	}

	@Override
	public void depositAmount(double dptAmount) throws InvalidAmountException {
		
		if(dptAmount<=0||dptAmount!=0) {
			throw new InvalidAmountException("please deposit multiples of 100");
		}else {
			accountBalance=accountBalance+dptAmount;
			statement.add("credited :"+dptAmount);
		}
		
	}

	@Override
	public double checkAccountBalance() {
		
		return accountBalance;
	}

	@Override
	public void changePinNumber(int pinNumber) {
		this.pinNumber=pinNumber;
		
	}

	@Override
	public int getPinNumber() {
		
		return pinNumber;
	}

	@Override
	public String getUserName() {
		
		return name;
	}

	@Override
	public void decreaseChances() {
		
		--chances;
		
	}

	@Override
	public int getChances() {
		
		return chances;
	}

	@Override
	public void resetPinNumber() {
		
		chances=3;
		
	}

	@Override
	public void generateMINIStatement() {
		int count=5;
		if(statement.size()==0) {
			System.out.println("there are no transactions happened");
			return;
		}
		System.out.println("======last 5 transactions====");
		Collections.reverse(statement);
		for(String trans:statement) {
			if(count==0) {
				break;
			}
			System.out.println(trans);
			count--;
		}
		Collections.reverse(statement);
	}
	

}

	
