import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int d1 = entree.nextInt();
      int f1 = entree.nextInt();
      int d2 = entree.nextInt();
      int f2 = entree.nextInt();
      
      if (d1<=d2 && d2<=f1){
         System.out.println("Amis");
      } else if (d1<=f2 && f2<=f1){
         System.out.println("Amis");
      } else if (d2<=d1 && d1<=f2){
         System.out.println("Amis");
      } else if (d2<=f1 && f1<=f2){
         System.out.println("Amis");
      } else {
         System.out.println("Pas amis");
      }
      
      
   
   }
}