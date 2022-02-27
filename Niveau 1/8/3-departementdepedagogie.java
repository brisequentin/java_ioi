import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int value = entree.nextInt();
      int test = entree.nextInt();
      int compteur = 1;
      
      while (value != test){
         if (value > test){
            System.out.println("c'est plus");
         } else {
            System.out.println("c'est moins");
         }
         compteur += 1;
         test = entree.nextInt();
      }
      System.out.println("Nombre d'essais nécessaires :");
      System.out.println(compteur);
      
      
   }
}