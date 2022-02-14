import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int val1 = entree.nextInt();
      int val2 = entree.nextInt();
      if (val1*val2>105){
         System.out.println("Surcharge !");
      }
   }
}