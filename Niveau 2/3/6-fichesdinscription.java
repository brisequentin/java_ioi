import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      for(int i=0; i<n; i++){
         String deux = entree.next();
         System.out.println(entree.next()+" "+deux);
      }
   }
}