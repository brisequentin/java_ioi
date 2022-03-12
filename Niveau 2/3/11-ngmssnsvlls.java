//le code est vrmt pas beau

import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      String titre = entree.nextLine();
      String auteur = entree.nextLine();
      
      //voyelle {a e i o u y}
      
      for(int i=0; i<titre.length(); i++){
         if(titre.charAt(i) != 'A' && titre.charAt(i) != 'E' && titre.charAt(i) != 'I' && titre.charAt(i) != 'O' && titre.charAt(i) != 'U' && titre.charAt(i) != 'Y' && titre.charAt(i) != ' '){
            System.out.print(titre.charAt(i));
         }    
      }
      System.out.println();
      for(int i=0; i<auteur.length(); i++){
         if(auteur.charAt(i) != 'A' && auteur.charAt(i) !='E' && auteur.charAt(i) !='I' && auteur.charAt(i) !='O' && auteur.charAt(i) !='U' && auteur.charAt(i) !='Y' && auteur.charAt(i) !=' ' ){
            System.out.print(auteur.charAt(i));
         }    
      }
      
   }
}