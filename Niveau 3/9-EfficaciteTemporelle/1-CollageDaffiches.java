import algorea.Scanner;
class Main
{
   public static void main(String[] args)
   {
      Scanner entrée = new Scanner(System.in);
      int nbRequêtes = entrée.nextInt();
      int nbAffiches = 0;
      int affiches[] = new int[nbRequêtes];
      for (int requête = 0; requête < nbRequêtes; requête++)
      {
         String question = entrée.next();
         if (question.charAt(0) == 'Q')
            System.out.println(nbAffiches);
         else
         {
            int affiche = entrée.nextInt();
            while ((nbAffiches > 0) && (affiches[nbAffiches-1] <= affiche))
               nbAffiches--;
            affiches[nbAffiches] = affiche;
            nbAffiches++;
         }
      }
   }
}