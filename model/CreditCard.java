package model;

public class CreditCard implements PaymentMethod{
	private double request;	
	private double response;
	
	@Override
	public double pay(double amount) {
		this.request = amount;
		this.response = amount * 1.05;
		return amount * 1.05;
	}
	
	@Override
	public String describeMethod() {
		System.out.print("Cartão de credito com o valor " + request + "como desconto, ficou: " + response);
		return "Cartão de credito com o valor " + request + "como desconto, ficou: " + response;
	}
}
