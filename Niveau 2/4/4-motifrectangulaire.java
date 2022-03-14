import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int row = entree.nextInt();
      int cols = entree.nextInt();
      char disp = entree.next().charAt(0);
      
      for (int i=0; i<row; i++){
         for (int y=0; y<cols; y++){
            System.out.print(disp);
         }
         System.out.println();
      }
   }
}

