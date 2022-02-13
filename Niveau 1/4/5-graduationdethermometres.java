import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int min = entree.nextInt();
      int max = entree.nextInt();
      
      for (int i = min; i<=max; i++){
         System.out.println(i);
      }
   }
}