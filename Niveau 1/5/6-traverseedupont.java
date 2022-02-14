import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int val1 = entree.nextInt();
      int val2 = entree.nextInt();
      
      if (val1+val2>=10){
         System.out.println("Taxe spéciale !");
         System.out.println("36");
      } else {
         System.out.println("Taxe régulière");
         System.out.println(2*val1+2*val2);
      }
   }
}