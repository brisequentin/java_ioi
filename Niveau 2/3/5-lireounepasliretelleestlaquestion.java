import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      
      int max = 0;
      
      for (int i=0; i<n; i++){
         String title = entree.nextLine();
         if (title.length() > max){
            System.out.println(title);
            max = title.length();
         }
         
      }
   }
}