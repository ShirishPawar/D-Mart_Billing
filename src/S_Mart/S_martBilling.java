package S_Mart;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class S_martBilling {
	
	public static void main(String[] args) {
		 
       String id =null;
       String productName=null;
        int quantity =0;
       double price =0.0;
       
       double totalPrice =0.0;
       double overAllPrice = 0.0;
       double cgst, sgst, subtotal =0.0, discount =0.0;
       char choice='\0';
       System.out.println("\t\t\t\t|--------------Invoice--------------|");
       System.out.println("\t\t\t\t\t" + "" +"-_- FriendZone -_-");
       System.out.println("\t\t\t\t\t karveNagar pune");
       System.out.println(" GSTIN:04AWMPP8569K725" + "\t\t\t\tContact: (+91) 8698022253 ");
         						
       							// format of data time
       SimpleDateFormat formatter = new SimpleDateFormat("DD/MM/YYYY HH:MM:SS");
       
       Date date = new Date();
       
       Calendar calendar = Calendar.getInstance();
       
       String[] days= new String[] {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
       
       //Print current date and time
       
       System.out.println("date: "+ formatter.format(date)+" "+ days[calendar.get(Calendar.DAY_OF_WEEK)-1]+"\t\t\t\t\t (+91) 8698022253");
       
       // create scanner class object 
       Scanner scan= new Scanner(System.in);
       System.out.println("Enter Customer Name: ");
       String customername = scan.nextLine();
       
       //creating an ArrayList to store the product 
       List<Product> product = new ArrayList<Product>();
       do {
    	   			// read Input value
    	   System.out.println("Enter the product details: ");
    	   				  
    	                System.out.print(" Product ID: ");
    	   			    id=scan.nextLine();
    	   			    productName=scan.nextLine();
    	   			    
    	   			   System.out.print(" Product Name: ");
    	   			   productName=scan.nextLine();
    	   				   
    	   				System.out.print("Quantity: ");
    	   				quantity =scan.nextInt();
    	   			
    	   				System.out.print("Price (per unit): ");
    	   				price=scan.nextDouble();
    	   				totalPrice = price * quantity;
    	   				overAllPrice = overAllPrice + totalPrice;
    	   			    
    	   				product.add(new Product(id, productName, quantity, price, totalPrice));
    	   				
    	   				//ask for continue shopping?
    	   				System.out.println("want to add more items?(y or n): ");
    	   				choice = scan.next().charAt(0);
    	   				scan.nextLine();
    	   				
       }while(choice=='y'|| choice=='y');
       				Product.displayFormate();
       		
       				for(Product p:product) {
       					p.disply();
       				}
       				System.out.println("\n\t\t\t\t\t\t\t\t\tTotal Amount(Rs.)"+overAllPrice);
       				discount=overAllPrice*12/100;
       				System.out.println("\n\t\t\t\t\t\t\t\t\t Discount (Rs.)"+discount);
       				subtotal = overAllPrice-discount;
       				System.out.println("\n\t\t\t\t\t\t\t\t\t Subtotal"+ subtotal);
       				sgst = overAllPrice*12/100;
       				System.out.println("\n\t\t\t\t\t\t\t\t\t SGST(%)"+sgst);
       				cgst = overAllPrice*12/100;
       				System.out.println("\n\t\t\t\t\t\t\t\t\t CGST(%)"+cgst);
       				System.out.println("\n\t\t\t\t\t\t\t\t\t      Invoice Total "+(subtotal+cgst+sgst));
       			     System.out.println("\t\t\t\t\t===========Thank You Visit============");
       			     scan.close();
       				
	}
  

}
