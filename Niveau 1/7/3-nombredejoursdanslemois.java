import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int input = entree.nextInt();
      
      
      if ( (1<=input && input<=3) || (7<=input && input<=9) ){
         System.out.println("30");
      } else if ( (4<=input && input<=6) || input == 10 ) {
         System.out.println("31");
      } else {
         System.out.println("29");
      }
      
   }
}