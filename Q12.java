 import java.util.*;
public class Q12{   
public static void main(String args[])
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Salary");
	double HRA;
	double DA;
	double basic = sc.nextDouble();
        if (basic < 10000)
	{
	   HRA = 0.1*basic;
	   DA = 0.9*basic;
         }
	else {

	HRA = 2000;
	 DA = 0.98*basic;
      }

double GS = basic + HRA + DA;

System.out.println("GROSS SALARY "+GS);

}
}
 