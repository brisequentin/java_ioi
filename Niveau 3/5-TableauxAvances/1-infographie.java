import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
       int nbLignes = entree.nextInt();
       int nbCols = entree.nextInt();
       
       char[][] tab = new char[nbLignes][nbCols];
       for (int i=0; i<nbLignes;i++){
          for(int v=0; v<nbCols; v++){
             tab[i][v] = '.';
          }
       }
       
       int nbRect= entree.nextInt();
       for(int i=0; i<nbRect; i++){
          int iLig1 = entree.nextInt();
          int iCol1 = entree.nextInt();
          int iLig2 = entree.nextInt();
          int iCol2 = entree.nextInt();
          char c = entree.nextLine().charAt(0);
          
          for(int v=iLig1; v<=iLig2; v++){
             for(int k=iCol1; k<=iCol2; k++){
                tab[v][k] = c;
             }
          }
       }
       
       
       
       
       //print
       for (int i=0; i<nbLignes;i++){
          for(int v=0; v<nbCols; v++){
             System.out.print(tab[i][v]);
          }
          System.out.println();
       }
   }
}