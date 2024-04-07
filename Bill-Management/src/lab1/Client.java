package lab1;

import java.util.Scanner;

public class Client {
	private String cid; //client id
	private String name; //client id
	private String address; //client id
	
	public Client() {
		cid = new String();
		name = new String();
		address = new String();
	}
	public Client(Client c) {
		cid = new String(c.cid);
		name = new String(c.name);
		address = new String(c.address);
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter the customer id: "); cid = sc.nextLine();
		System.out.println("Pls enter the customer name: "); name = sc.nextLine();
		System.out.println("Pls enter the customer address: "); address = sc.nextLine();
	}
	public void show() {
		System.out.println("cus id: "+cid+", cus name: "+name+", cus address: "+address);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("cus id: "+cid+", cus name: "+name+", cus address: "+address+"\n");
	}
	public float getDiscount() {
		return 0.0f;
	}
}
