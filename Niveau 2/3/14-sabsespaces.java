import algorea.Scanner;
import java.lang.StringBuffer;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      StringBuffer texte = new StringBuffer(entree.nextLine());
      for (int i=0; i<texte.length(); i++){
         if (texte.charAt(i) == ' '){
            texte.setCharAt(i,'_');
         }
      }
      System.out.println(texte);
   } 
}