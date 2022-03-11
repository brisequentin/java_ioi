import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      int lMin = entree.nextInt();
      
      for (int i=0; i<n; i++){
         String title = entree.nextLine();
         if(entree.nextLine().length() < lMin){
            System.out.println(title);
         }
      }
   }
}