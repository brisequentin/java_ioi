
import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int[] tab = {500, 180, 650, 25, 666, 42, 421, 1, 370, 211};
      
      int n = entree.nextInt();
      
      System.out.println(tab[n]);
   }
}