package model;

public interface PaymentMethod {
	public double pay(double amount);
	public String describeMethod(); 
}