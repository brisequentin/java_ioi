import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int start = entree.nextInt();
      int pas = entree.nextInt();
      int rep = entree.nextInt();
      
      for (int i = 0; i<=rep; i++){
         System.out.println(start);
         start = start + pas;
      }
      
   }
}