
import java.util.Scanner;

public class Detail {
	private int quan; // quantity
	private float uprice; // unit price
	private Product p;
	
	public Detail() {
		quan = 0;
		uprice = 0.0f;
		p = new Product();
	}
	public Detail(Detail d) {
		quan = d.quan;
		uprice = d.uprice;
		p = new Product(d.p);
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		p.input();
		
		System.out.println("Pls enter the product's quantity: "); quan = sc.nextInt();
		System.out.println("Pls enter the product's unit price: "); uprice = sc.nextFloat();
	}
	public void show() {
		System.out.println("quantity: "+quan+", unit price: "+uprice);
		p.show();
		System.out.println("cost: "+cost());
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("quantity: "+quan+", unit price: "+uprice+"\n"+p + ", cost: "+cost());
	}
	
	public float cost() {
		return quan*uprice;
	}
	
	
}
