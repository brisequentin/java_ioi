import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      
      for (int i=0; i<n; i++){
         String s = entree.nextLine();
         for (int y=0; y<s.length(); y++){
         System.out.print(s.charAt(s.length()-y-1));
         }
         System.out.println();
      }
   }
}