package model;

public class Pix implements PaymentMethod{
	@Override
	public double pay(double amount) {
		return amount * 0.95;
	}
	
	@Override
	public String describeMethod() {
		System.out.print("Pix");
		return "Pix";
	}
}
