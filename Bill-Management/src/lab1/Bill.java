package lab1;

import java.util.Scanner;

public class Bill {
	private String id;
	private String title;
	private String staff;
	private Date paydate;
	private Client k;
	private Detail p[];
	
	public Bill() {
		id = new String();
		title = new String();
		staff = new String();
		paydate = new Date();
		k = new Client();
		p = new Detail[50]; // 50 hang
		
	}
	public Bill(Bill b) {
		id = new String(b.id);
		title = new String(b.title);
		staff = new String(b.staff);
		paydate = new Date(b.paydate);
		k = new Client(b.k);
		
		p = new Detail[50];
		for(int i = 0; i<50; i++) {
			if(b.p[i] == null) break;
			else p[i] = new Detail(b.p[i]);
		}
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter the Bill id: "); id = sc.nextLine();
		System.out.println("Pls enter the Bill title: "); title = sc.nextLine();
		System.out.println("Pls enter name staff: "); staff = sc.nextLine();
		paydate.input();
		int choose = 0;
		System.out.println("Pls enter normal(0) or (1) VIP Customer: "); choose = sc.nextInt();
		if(choose == 1) k = new ClientVIP();
		k.input();
		System.out.println("Pls enter number of product: "); int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			p[i] = new Detail();
			p[i].input();
		}
		
		
	}
	public void show() {
		System.out.println("bill id: "+id+"\nbill title: "+title+"\nstaff: "+staff);
		System.out.println("date: "+paydate);
		System.out.println(k);
		System.out.println("product info: ");
		int cnt = 0;
		for(var e : p) 
			if(e == null) break;
			else {
				cnt++;
				System.out.println("product "+cnt+":\n"+e);
			}
		System.out.println("Total cost: "+total_cost());
	}
	@Override
	public String toString() {
		String s = ("bill id: "+id+"\nbill title: "+title+"\nstaff: "+staff + "\ndate: "+paydate);
		s += (k);
		s += ("product info:\n");
		int cnt = 0;
		for(var e : p) 
			if(e == null) break;
			else {
				cnt++;
				s += ("product "+cnt+":\n"+e);
			}
		s += "Total cost: " + total_cost();
		return s;
	}
	
	public float total_cost() {
		float sum = 0.0f;
		for(var e : p) {
			if(e == null) break;
			else sum += e.cost();
		}
		sum = sum*(1 - k.getDiscount()/100);
		
		return sum;
	}
	
}
