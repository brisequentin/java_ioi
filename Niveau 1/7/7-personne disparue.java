import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int wanted = entree.nextInt();
      int n = entree.nextInt();
      
      boolean ville = true;
      
      for (int i=1; i<=n; i++){
         int temp = entree.nextInt();
         if (temp == wanted){
             ville = false; 
         }  
      }
      if (ville){
         System.out.println("Encore dans la ville");
      } else {
         System.out.println("Sorti de la ville");
      }
   } 
}


