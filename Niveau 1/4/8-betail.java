import algorea.Scanner;
class Main {
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args) {
      int add = 0;
      for (int i=1; i<=20; i++){
      add += entree.nextInt();   
      }
      System.out.println(add);
      
   }
}