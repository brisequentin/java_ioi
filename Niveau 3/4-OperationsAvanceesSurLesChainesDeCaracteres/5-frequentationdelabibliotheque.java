import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int sum = 0;
      boolean tries = true;
      while(tries){
         try{
            sum += entree.nextInt();
         } catch (Exception e) {
            tries=false;
         }
      }
      System.out.println(sum);
   }
}