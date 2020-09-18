    

  import java.util.*;

   public class Q5{
        public static void main( String args[]){

   Scanner sc = new Scanner(System.in);
   System.out.println("enter radius");
  
   int radii = sc.nextInt();
  
   double PI= 3.14;

   double area = Math.pow(radii,2) * PI;
   System.out.println(area);
  
  double cirm = 2 * PI * radii;
 System.out.println(cirm);


}
}