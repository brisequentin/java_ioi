import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int pass = 4242;
      System.out.println("Entrez le code :");
      int code = entree.nextInt();
      while(pass!=code){
         System.out.println("Entrez le code :");
         code = entree.nextInt();  
      }
      System.out.println("Encore une fois.");
      System.out.println("Entrez le code :");
      code = entree.nextInt();
      while(pass!=code){
         System.out.println("Entrez le code :");
         code = entree.nextInt();  
      }
      System.out.println("Bravo.");
         
      
   }
}