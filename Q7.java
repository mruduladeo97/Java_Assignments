    

  import java.util.*;

   public class Q7{
        public static void main( String args[]){

   Scanner sc = new Scanner(System.in);
   System.out.println("enter number of sub.");

  int subjects = sc.nextInt();
   
  int sum=0;
  for(int i=0; i<subjects; i++){
 System.out.print("enter subject "+i+" marks ");
   int marks = sc.nextInt();
   sum+= marks;
}

 

 double per = sum/(double)subjects;

  System.out.println("percwntage is= "+per +"%");
}
}