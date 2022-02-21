import algorea.Scanner;
class Main
{
   public static void main(String[] args)
   {
      Scanner entrée = new Scanner(System.in);
      int nbMaisons = entrée.nextInt();
      
      int infini = 1000 * 1000;
      int xMin = infini, xMax = 0, yMin = infini, yMax = 0;
      
      for (int loop = 1; loop <= nbMaisons; loop = loop + 1)
      {
         int posX = entrée.nextInt();
         int posY = entrée.nextInt();
         if(posX < xMin)
         {
            xMin = posX;
         }
         if(posX > xMax)
         {
            xMax = posX;
         }
         if(posY < yMin)
         {
            yMin = posY;   
         }
         if(posY > yMax)
         {
            yMax = posY;
         }
      }     
      int largeur = xMax - xMin, hauteur = yMax - yMin;
      int périmètre = 2 * (largeur + hauteur);
      System.out.println(périmètre);
   }
}