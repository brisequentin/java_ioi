import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int nproduits = entree.nextInt();
      int[] tab = new int[nproduits];
      int npersonne = entree.nextInt();
      
      for (int i=0; i<npersonne; i++){
         tab[entree.nextInt()] += 1;
      }
      for (int i=0; i<nproduits; i++){
         System.out.println(tab[i]);
      }
      
   }
}