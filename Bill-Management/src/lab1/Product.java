package lab1;

import java.util.Scanner;

public class Product {
	private String id;
	private String name;
	private String producer;
	
	public Product() {
		id = new String();
		name = new String();
		producer = new String();
	}
	public Product(Product p) {
		id = new String(p.id);
		name = new String(p.name);
		producer = new String(p.producer);
	}
	
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter the product's id: "); id = sc.nextLine();
		System.out.println("Pls enter the product's name: "); name = sc.nextLine();
		System.out.println("Pls enter the product's manufacturer: "); producer = sc.nextLine();
	}
	public void show() {
		System.out.println("id: "+id+", name: "+name+", producer: "+producer);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("id: "+id+", name: "+name+", producer: "+producer);
	}
}
