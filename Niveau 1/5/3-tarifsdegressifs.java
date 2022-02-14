import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int val1 = entree.nextInt();
      int prix = 10 + val1*5;
      if (prix<=53){
         System.out.println(prix);
      } else {
         System.out.println(53);
      }
   }
}