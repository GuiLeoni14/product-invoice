package model;

public class CreditCard implements PaymentMethod{
	@Override
	public double pay(double amount) {
		return amount * 1.05;
	}
}
