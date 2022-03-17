import algorea.Scanner;
import java.util.Collections;


class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      char[] s = entree.nextLine().toUpperCase().toCharArray();
      int[] i = new int[26];
      
      for (char c : s){
         if ( c != ' '){
            i[(int)(c)-65] += 1;
         }
      }  
      int max = i[0];
      int pos = 0;
      
      for (int innt=0; innt<26; innt++){
         if (i[innt] > max){
            max=i[innt];
            pos = innt;
         }
      }   
      System.out.println((char)(pos+65));
   }
}