import algorea.Scanner;
class Main {
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args) {
      int longueur = entree.nextInt();
      
      System.out.println(longueur*longueur*23);
   }
}