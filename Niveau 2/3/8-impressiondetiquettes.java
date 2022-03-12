import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      String phrase = entree.nextLine();
      int len = phrase.length();
      
      for (int i=0; i<len; i++){
         System.out.println(phrase.charAt(i));
      }
      
   }
}