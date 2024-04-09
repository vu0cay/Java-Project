

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BillApp {
	public static float getTotalRevenue(ArrayList<Bill> list) {
		float revenue = 0.0f;
		for(var e : list) 
			revenue += e.total_cost();
		return revenue;
	}
	public static ArrayList<Bill> findBill(ArrayList<Bill> list, int date, int choice) {
		// 0: day
		// 1: month
		// 2: year
		ArrayList<Bill> l = new ArrayList<Bill>();
		for(var e : list) {
			if(choice == 0) 
				if(date == e.getPayDate().getDay())  l.add(new Bill(e));
			 else if(choice == 1) 
				if(date == e.getPayDate().getMonth())  l.add(new Bill(e));				
			 else if(choice == 2) 
			if(date == e.getPayDate().getYear())  l.add(new Bill(e));				
		
		}
		
		return l;
	}
	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of bill: "); 
		int n = sc.nextInt();
		ArrayList<Bill> list = new ArrayList<Bill>(n);
		
		for(int i = 0; i<n; i++){
			list.add(new Bill());
			list.get(i).input();
		}
		for(var e : list) {
			e.show();
			System.out.println();
		}
		float total_revenue = getTotalRevenue(list);
		System.out.println("Total revenue: " + total_revenue);
		// tinh doanh thu theo thang, nam, quy
		
		System.out.println("Find bills by day(0), month(1), year(2): ");
		int c = sc.nextInt();
		System.out.println("Choose the value to find: ");
		int date = sc.nextInt();
		ArrayList<Bill> revenuebill = findBill(list, date, c);
		float sum = getTotalRevenue(revenuebill);
		if(c == 0)
			System.out.println("Total of revenue by day \""+date+"\" is: " + sum);
		if(c == 1) 
			System.out.println("Total of revenue by month \""+date+"\" is: " + sum);
		else System.out.println("Total of revenue by year \""+date+"\" is: " + sum);
		
		// tim kiem hoa don theo ngay	
		System.out.println("Find bills by day(0), month(1), year(2): ");
		c = sc.nextInt();
		System.out.println("Choose the value to find: ");
		date = sc.nextInt();
		ArrayList<Bill> fbill = findBill(list, date, c);
		for(var e : fbill) {
			e.show();
			System.out.println();
		}
		// cho biet hoa don nao ban nhieu nhat
		System.out.println("list after sorted by total cost in each bill");
		Collections.sort(list, (o1, o2) -> compare(o1, o2));
		for(var e : list) {
			e.show();
		}
	}
	public static int compare(Bill o1, Bill o2) {
		if(o1.total_cost() > o2.total_cost()) return 1;
		return 0;
	}
}
