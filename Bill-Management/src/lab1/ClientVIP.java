package lab1;

import java.util.Scanner;

public class ClientVIP extends Client{
	
	private float perDiscnt;
	private Date beginVip;
	public ClientVIP() {
		super();
		perDiscnt = 0.0f;
		beginVip = new Date();
	}
	public ClientVIP(ClientVIP c) {
		super((Client) c);
		perDiscnt = c.perDiscnt;
		beginVip = new Date(c.beginVip);
	}
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter the customer VIP discount(%): "); perDiscnt = sc.nextFloat();
		System.out.println("Pls enter the customer VIP begin date(%): ");
		beginVip.input();
	}
	public void show() {
		super.show();
		System.out.println("VIP begin "+beginVip+", cus (%) discount: "+perDiscnt);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ("VIP begin "+beginVip+", Cus (%) discount: "+perDiscnt);
	}
	
	public float getDiscount() {
		return perDiscnt;
	}
	
}
