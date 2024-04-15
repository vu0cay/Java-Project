

import java.util.Scanner;

public class Date {
	private int d;
	private int m;
	private int y;
	public Date() {
		d = 0;
		m = 0;
		y = 0;
	}
	public Date(int d, int m, int y) {
		this.d = d;
		this.m = m;
		this.y = y;
	}
	public Date(Date date) {
		this.d = date.d;
		this.m = date.m;
		this.y = date.y;
	}
	public boolean valid() {
		
		int month[] = {
				0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
		};
		if((y % 4 == 0 && y % 100 != 0) || y%400 == 0) {
			month[2] = 29;
		}
		if( m < 1 || m > 12 || d < 1 || d > 31
			|| d > month[m]
			) return false;
			
		return true;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date: ");
		do {
			d = sc.nextInt();
			m = sc.nextInt();
			y = sc.nextInt();
		} while(!valid());
		
	}
	public void show() {
		System.out.println(d+"/"+m+"/"+y);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return d+"/"+m+"/"+y;
	}
	// getter & setter
	public int getDay() {
		return d;
	}
	public int getMonth() {
		return m;
	}
	public int getYear() {
		return y;
	}
	
}
