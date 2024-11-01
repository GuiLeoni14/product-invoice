package model;

public class DebitCard implements PaymentMethod{
	@Override
	public double pay(double amount) {
		return amount;
	}
}
