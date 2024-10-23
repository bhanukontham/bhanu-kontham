package com.codegnan.interfaces;
import com.codegnan.customExceptions.NotAOperatorException;
import com.codegnan.customExceptions.InSuffientBalanceException;
import com.codegnan.customExceptions.InSuffientMachineBalanceException;
import com.codegnan.customExceptions.InvalidAmountException;

public interface IATMService {
	//to get the user  type whether the user is operator or normal user
	//NotAoperatorException
	public abstract String getUserType() throws NotAOperatorException;
	
	//to withdraw amount
	//1. will throw InvalidAmountException if the amount is not a valid denomination.
	//2. will throw InsuffientBalanceException if the customer has insuffient in their account
	//3. will throw InsuffientMachineBalanceException if the machine has sufficientcash/InsuffientCash
	public abstract double withdrawAmount(double withAmount) throws InvalidAmountException,InSuffientBalanceException,InSuffientMachineBalanceException;
	
	 
	
	//to depositAmount
	public abstract void depositAmount(double dptAmount) throws InvalidAmountException;
	
	//to check balance
	public abstract double checkAccountBalance();
	
	// to get pin
	public abstract int getPinNumber();
	 
	
	//to change the pin  number
	public abstract void changePinNumber(int pinNumber);	
	
	//to get userName
	public abstract String getUserName();
	
	//to decrease the number of chances while entering the wrong number
	public abstract void decreaseChances();
	
	//to get the chances of the pinNumber
	public abstract int getChances();
	
	//to reset thepinNumber
	public abstract void resetPinNumber();
	
	//to get MINIStatement
	public abstract void generateMINIStatement();
	
	

}
