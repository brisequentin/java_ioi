import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int debut = entree.nextInt();
      int fin = entree.nextInt();
      int n = entree.nextInt();
      
      int compteur = 0;
      int input;
      
      for (int i=1; i<=n; i++){
         input = entree.nextInt();
         if (input >= debut && input <= fin){
            compteur +=1;
         }
      }
      System.out.println(compteur);
   }
}