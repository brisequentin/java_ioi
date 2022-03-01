import algorea.Scanner;
import static java.lang.Math.*;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      double qt = entree.nextDouble();
      System.out.println( (int) ( ceil(qt/60)*45) );
   }   
}
