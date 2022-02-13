import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int table =  entree.nextInt();
      int calc = 66;
      
      for (int i=1; i<=table; i++){
         calc = calc * i;
         System.out.println(calc);
      }
      
   }
}