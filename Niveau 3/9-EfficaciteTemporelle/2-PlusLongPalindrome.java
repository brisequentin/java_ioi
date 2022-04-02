import algorea.Scanner;
class Main {
   public static void main(String[] args) {
      Scanner clavier = new Scanner(System.in);
      String texte = clavier.nextLine();
      int taille = texte.length();
      int maximum = 1;
      int moitié = 1;
      while (moitié <= taille - maximum / 2)
      {
         int longueur = 1;
         int inf = moitié - 1;
         int sup = moitié + 1;
         while ((inf >= 0) && (sup < taille) && (texte.charAt(inf--) == texte.charAt(sup++)))
            longueur += 2;
         maximum = Math.max(maximum, longueur);
         longueur = 0;
         inf = moitié - 1;
         sup = moitié;
         while ((inf >= 0) && (sup < taille) && (texte.charAt(inf--) == texte.charAt(sup++)))
            longueur += 2;
         maximum = Math.max(maximum, longueur);
         moitié++;
      }
      System.out.println(maximum);
   }
}