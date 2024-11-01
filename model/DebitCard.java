package model;

public class DebitCard implements PaymentMethod{
	private double request;	
	private double response;
	@Override
	public double pay(double amount) {
		this.request = amount;
		this.response = amount;
		return amount;
	}
	
	@Override
	public String describeMethod() {
		System.out.print("Cartão de debito com o valor " + request + "como desconto, ficou: " + response);
		return "Cartão de debito com o valor " + request + "como desconto, ficou: " + response;
	}
}
