import java.util.Scanner;
class Product{
	private int pid;
	private double price;
	private int quantity;

	Product(int pid,double price,int quantity){
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	void display(){
		
		System.out.println("Pid: "+pid+"  Price "+price+"  Quantity "+quantity);
	}
	

	double getprice(){
 		return(this.price);
	}
	int getppid(){
 		return(this.pid);
	}
	static double totalAmount(Product p[]){
		double total=0;
		for(int i=0;i<p.length;i++){
			total+=((p[i].price)*(p[i].quantity));                                  		
		}
		return total;
	}


}
class Q039{
public static void main(String args[]){
 	Product p[]=new Product[3];
   	int pid;
	int quantity;
 	double price;	
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<p.length;i++){
		System.out.println("Enter Pid, Price, Quantity: ");
                              	pid=sc.nextInt();
		price=sc.nextDouble();
		quantity=sc.nextInt();
		p[i]=new Product(pid,price,quantity);
	}

	System.out.println("Product Details: ");
                      for(Product a:p){
		a.display();
	}
                    double temp=0;
                     int ppid=0;
                 	for(int i=0;i<p.length;i++){
		temp=p[i].getprice();
		ppid=p[i].getppid();
		for(int j=0;j<p.length;j++){
		 if(temp>p[i].getprice()){
			temp=p[i].getprice();
			ppid=p[i].getppid();
		}
		}
	}
	System.out.println("Maximum Price of prodoct and Pid is: 	"+ppid+"  "+temp);
	
	System.out.println("Total amount of the products: "+Product.totalAmount(p));
	
}}