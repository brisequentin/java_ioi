import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = 0;
      int sum = 0; 
      while (n != -1){
         sum += n;
         n = entree.nextInt();
      }
      System.out.println(sum);
   }
}