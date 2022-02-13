import algorea.Scanner;
class Main {
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args) {
      int nbKarva = entree.nextInt();
      for (int i=1; i<= nbKarva; i++){
         int poids = entree.nextInt();
         int age = entree.nextInt();
         int lg = entree.nextInt();
         int h = entree.nextInt();
         
         System.out.println(poids + lg*h);
      }
   }
}