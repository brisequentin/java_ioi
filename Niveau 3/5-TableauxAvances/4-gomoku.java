import java.util.Scanner;
class Main {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrée = new Scanner(System.in);
        int taille = entrée.nextInt();
        int[][] plateau = new int[taille][taille];
        for (int ligne = 0; ligne < taille; ligne++)
            for (int colonne = 0; colonne < taille; colonne++)
                plateau[ligne][colonne] = entrée.nextInt();
        
        int[] deltaLig = { -1, 0, 1, 1 };
        int[] deltaCol = {  1, 1, 1, 0 };
        
        for (int ligne = 0; ligne < taille; ligne++)
            for (int colonne = 0; colonne < taille; colonne++)
            {
                int joueur = plateau[ligne][colonne];
                if (joueur > 0)
                    for (int direction = 0; direction < 4; direction++)
                    {
                        int lig = ligne;
                        int col = colonne;
                        int alignés = 1;
                        for (int position = 0; position < 4; position++)
                        {
                            lig += deltaLig[direction];
                            col += deltaCol[direction];
                            if ((0 <= lig) && (lig < taille) && (0 <= col) && (col < taille))
                                if (plateau[lig][col] == joueur)
                                    alignés++;
                        }
                        if (alignés == 5)
                        {
                            System.out.println(joueur);
                            System.exit(0);
                        }
                    }
            }
        System.out.println(0);
    }
}