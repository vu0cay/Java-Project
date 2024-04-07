package lab1;

import java.util.Scanner;

public class BillApp {
	public static float getTotalRevenue(Bill listBill[], int n) {
		float revenue = 0.0f;
		for(int i = 0; i<n; i++) 
			revenue += listBill[i].total_cost();
		return revenue;
	}
	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of bill: "); 
		int n = sc.nextInt();
		Bill listBill[] = new Bill[n];
		
		for(int i = 0; i<n; i++) {
			listBill[i] = new Bill();
			listBill[i].input();
		}
		for(int i = 0; i<n; i++)
			listBill[i].show();
		System.out.println("Total revenue: " + getTotalRevenue(listBill,n));
		// tinh doanh thu theo thang, nam, quy
		// tim kiem hoa don theo ngay
		// cho biet hoa don nao ban nhieu nhat
		
	}
	
}
