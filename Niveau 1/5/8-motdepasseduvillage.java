import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int val1 = entree.nextInt();

      if (val1==64741){
         System.out.println("Bon festin !");
      } else {
         System.out.println("Allez-vous en !");
      }

}
}