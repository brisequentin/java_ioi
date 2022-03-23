import algorea.Scanner;
import java.util.Collections;


class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      String s = entree.nextLine();
      int decal = decalage(s.toUpperCase().toCharArray());
      texte(s,decal);
      
   }
   
   static int decalage(char[] s){
      int[] i = new int[26];
      
      for (char c : s){
         if ( Character.isLetter(c)){
            //System.out.println((int)(c)-65);
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
      
      int decal = (69-(pos+65));
      //System.out.println((char)(pos+65));
      return(decal);
   }
   
   static void texte(String s,int decalage){
      StringBuffer texte = new StringBuffer(s);
      for (int iCar = 0; iCar < texte.length(); iCar = iCar + 1)
      {
         char caractere = texte.charAt(iCar);
         if (Character.isLetter(caractere))
         {
            boolean isMaj = Character.isUpperCase(caractere);
            if (isMaj)
            {
               caractere = Character.toLowerCase(caractere);
            }
            /*
            Attention, le modulo en Java peut donner un résultat négatif, compris
            entre -25 et 0. D’où le +26 (pour le rendre positif à coup sûr) et le
            nouveau modulo ensuite.
            */
            int numero = ((caractere - 'a' + decalage) % 26 + 26) % 26;
            caractere = (char)(numero + 'a');
            if (isMaj)
            {
               caractere = Character.toUpperCase(caractere);
            }
            texte.setCharAt(iCar, caractere);
         }
      }
      System.out.println(texte);
   }
}