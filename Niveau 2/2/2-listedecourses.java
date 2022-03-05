import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int somme = 0;
      int[] tab = {9, 5, 12, 15, 7, 42, 13, 10, 1, 20};
      for (int i=0; i<10; i++){
           somme += tab[i]*entree.nextInt();
      }
      System.out.println(somme);
   }
}