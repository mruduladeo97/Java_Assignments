import java.util.*;
class MathOpr{

    static int add(int n1 , int n2){
     return n1 + n2;
    }

    static int sub(int n1 , int n2){
        return n1 - n2;
       }

       static int multi(int n1 , int n2){
        return n1 * n2;
       }

       static double power(int n1 , int n2){
        return Math.pow(n1,n2);
       }
}
class Q35
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter two number");
   int num1 = sc.nextInt();
   int num2 = sc.nextInt();
   System.out.println("addition is "+MathOpr.add(num1,num2));
   System.out.println("substraction is "+MathOpr.sub(num1,num2));
   System.out.println("multiplication is "+MathOpr.multi(num1,num2));
   System.out.println("power is "+MathOpr.power(num1,num2));
   }
}