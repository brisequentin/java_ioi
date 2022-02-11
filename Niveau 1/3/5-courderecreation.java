/*
La cour carrée a été mesurée avec quatre bâtons de longueurs respectives 17 m, 7 m, 5 m et 2 m. La longueur du côté de la cour est égale à 5 fois le premier bâton plus 2 fois le second plus 1 fois le troisième plus 2 fois le quatrième.

Votre programme doit afficher deux lignes : la première doit contenir la surface de la cour, et la seconde ligne doit contenir son périmètre. Les résultats doivent être exprimés en mètres carrés et en mètres, respectivement, mais vous ne devez pas afficher l'unité après la valeur numérique.
*/

class Main{
    public static void main(String[] args){
       int baton1 = 17;
       int baton2 = 7;
       int baton3 = 5;
       int baton4 = 2;
       int longueur = 5*baton1 + 2*baton2 + baton3 + 2*baton4;
       int surface = longueur*longueur;
       int perim = longueur*4;
       System.out.println(surface);
       System.out.println(perim);
    }
 }