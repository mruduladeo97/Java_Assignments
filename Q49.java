import java.util.Scanner;
interface Taxable{
	double salesTax=0.7;
	double incomeTax=0.105;
	void calcTax();
}
class Employee implements Taxable{
	int empid;
	String name;
	double sal;
	Employee(){}
	Employee(int empid,String name,double sal){
		this.empid=empid;
		this.name=name;
		this.sal=sal;
	}
	public void calcTax(){
		double incomeTax1=sal*incomeTax;
		System.out.println("total incometax= "+incomeTax1);
	}
	
}
class product implements Taxable{
	int pid;
	int price;
	int quantity;
	product(){}
	product(int pid,int price,int quantity){
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	public void calcTax(){
		double saletax1=price*quantity*salesTax;
	System.out.println("total saletax= "+saletax1);

	}
	
}


class Q49{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter empid ,name ,and salary for emplyee ");
			int empid=sc.nextInt();
			String name=sc.next();
			double sal=sc.nextDouble();
		System.out.print("Enter pid ,price ,and quantity for product ");
			int pid=sc.nextInt();
			int price=sc.nextInt();
			int quantity=sc.nextInt();
	    Taxable t=new Employee();
		t.calcTax();
		  Taxable t1=new product();
	    t1.calcTax();
       
	}
}
