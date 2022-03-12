import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      String nom = entree.nextLine();
      char nom0 = nom.charAt(0);
      
      if (nom0 <= 'F'){
         System.out.println(1);
      } else if ( 'G' <= nom0 && nom0 <= 'P' ) {
         System.out.println(2);
      } else {
         System.out.println(3);
      }
      
   }
}
