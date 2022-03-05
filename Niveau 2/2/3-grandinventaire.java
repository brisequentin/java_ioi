import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      int[] tab = {0,0,0,0,0,0,0,0,0,0};
      for (int i=0; i<n; i++){
         int pos = entree.nextInt()-1;
         tab[pos] += entree.nextInt();
      }
      
      for (int i=0; i<10; i++){
         System.out.println(tab[i]);
      }
   }
}