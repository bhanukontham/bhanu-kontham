package com.codegnan.customExceptions;

public class InSuffientBalanceException extends Exception {
	public InSuffientBalanceException(String errorMsg) {
		super(errorMsg);
	}

}
