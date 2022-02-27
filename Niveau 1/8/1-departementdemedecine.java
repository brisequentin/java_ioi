import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int pop = entree.nextInt();
      int infected = 1;
      int jours = 1;
      
      while (infected < pop){
         infected = infected + infected*2;
         jours += 1;
      }
      
      System.out.println(jours); 
   }
}