package S_Mart;

public class Product {

	private String id;
	private String productName;
	private int qty;
	private double price;
	private double totalprice;
	Product( String id,String productName,int qty,double price,double totalprice) {
			this.id =id;
			this.productName =productName;
			this.qty =qty;
			this.price=price;
			this.totalprice=totalprice;  	
	      }
	  
	public String getId() {
		return id;
	}
	public String getProductName() {
		return productName;
	}
	public int getQty() {
		return qty;
	}
	public double getPrice() {
		return price;
	}
	public double getTotalprice() {
		return totalprice;
	}
	
	public static void displayFormate() {
		System.out.format("----------------------------------------------------------\n");
	}
	
	public void disply() {
		System.out.format("%-10s, %-9s, %-5d,%9.2f,  %15.2f\n",id,productName,qty,price,totalprice);
	}

}
