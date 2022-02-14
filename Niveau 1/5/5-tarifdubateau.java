import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int val1 = entree.nextInt();
      
      if (val1<21){
         System.out.println("Tarif réduit");
      } else {
         System.out.println("Tarif plein");
      }
   }
}