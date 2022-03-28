import algorea.Scanner;
class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrée = new Scanner(System.in);
        int nbPassages = entrée.nextInt();
        int nbLignes = entrée.nextInt();
        int nbColonnes = entrée.nextInt();
        char[][][] grilles = new char[2][nbLignes][nbColonnes];
        for (int ligne = 0; ligne < nbLignes; ligne++)
        {
            String la_ligne = entrée.next();
            for (int colonne = 0; colonne < nbColonnes; colonne++)
                grilles[0][ligne][colonne] = la_ligne.charAt(colonne);
        }
        
        int source = 0;
        for (int passage = 0; passage < nbPassages; passage++)
        {
            int destination = 1 - source;
            for (int ligne = 0; ligne < nbLignes; ligne++)
                for (int colonne = 0; colonne < nbColonnes; colonne++)
                    if ((grilles[source][ligne][colonne] == '.') ||
                            (ligne == 0) || (ligne == nbLignes - 1) ||
                            (colonne == 0) || (colonne == nbColonnes - 1) ||
                            (grilles[source][ligne-1][colonne] == '.') ||
                            (grilles[source][ligne+1][colonne] == '.') ||
                            (grilles[source][ligne][colonne-1] == '.') ||
                            (grilles[source][ligne][colonne+1] == '.'))
                        grilles[destination][ligne][colonne] = '.';
                    else
                        grilles[destination][ligne][colonne] = '#';
            source = destination;
        }
        
        for (char[] ligne : grilles[source])
        {
            for (char pixel : ligne)
                System.out.print(pixel);
            System.out.println();
        }
    }
}