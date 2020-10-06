import java.util.Scanner;

abstract class Processor{
	int data;
	abstract void Process(int i);
	void showData()
	{
		System.out.println("data = "+data);
	}
}
class factorial extends Processor{
	
	void Process(int i){
		 int j,fact=1;  
         
        for(j=1;j<=i;j++){    
           fact=fact*j;    
        }
         data=fact;	   
	

		 
}
}

class circle extends Processor{
	
	double pi=3.14;
	double area;
	void Process(int i){
		
		area=pi*i*i;
		data=(int)area;
	}
	//super.show();
}
class Q48{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for factorial and 2 for area of circle ");
	    int number=sc.nextInt();
         switch (number) {

            // performs addition between numbers
            case 1:
                 Processor p1=new factorial();
	             p1.Process(5);
				 p1.showData();
                break;
			case 2:
			     
	             Processor p=new circle();
	             p.Process(2);
	            
				 p.showData();
                 break;
			default:
			   System.out.println("Invalid choice");
			   break;
	    
	      }
	  
       
	}
}
