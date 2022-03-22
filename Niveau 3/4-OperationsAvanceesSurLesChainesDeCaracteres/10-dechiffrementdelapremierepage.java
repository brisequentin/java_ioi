import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      char[] grille = entree.nextLine().toCharArray();
      char[] texte = entree.nextLine().toCharArray();
      
      for (char c: texte){
         if (Character.isLetter(c)){
            //entre 65 et 90 pour maj
            //entre 
            if (Character.isUpperCase(c)){
            System.out.print(Character.toUpperCase(grille[((int)c -65)]));
            } else {
            System.out.print(Character.toLowerCase(grille[((int)c -97)]));
            }
         }else{
            System.out.print(c);
         }
      }     
   }  
}