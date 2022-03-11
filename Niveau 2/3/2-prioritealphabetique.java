import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      String prenom1 = entree.nextLine();
      String prenom2 = entree.nextLine();
      
      if (prenom1.compareTo(prenom2) < 0){
         System.out.println(prenom1);
      } else if (prenom1.compareTo(prenom2) > 0){
         System.out.println(prenom2);
      }
   }
}