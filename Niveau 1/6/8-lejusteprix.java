import algorea.Scanner;
class Main
{
   public static void main(String[] args)
   {
      Scanner entrée = new Scanner(System.in);
      int nbMarchands = entrée.nextInt();
      
      int infini = 1000 * 1000;
      int minPrix = infini, posMinPrix = -1;
      for (int pos = 1; pos <= nbMarchands; pos = pos + 1)
      {
         int prix = entrée.nextInt();
         if (prix <= minPrix)
         {
            minPrix = prix;
            posMinPrix = pos;
         }
      }
      System.out.println(posMinPrix);
   }
}