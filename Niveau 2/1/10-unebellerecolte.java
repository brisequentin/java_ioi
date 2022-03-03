import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int nbPers = entree.nextInt();
      int nbFruit = entree.nextInt();
      
      if (nbFruit%nbPers==0){
         System.out.println("oui");
      } else {
         System.out.println("non");
      }
   }
}