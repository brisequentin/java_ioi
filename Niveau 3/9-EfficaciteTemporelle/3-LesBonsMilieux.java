import algorea.Scanner;
class Point
{
   int x,y;
   Point(int x,int y)
   {
      this.x = x;
      this.y = y;
   }
}
class Main
{
   public static void main(String[] args)
   {
      final int X_MAX = 100;
      final int Y_MAX = 100;   
      boolean estUnPoint[][] = new boolean[X_MAX+1][Y_MAX+1];
      for (int x = 0; x <= X_MAX; x++)
         for (int y = 0; y <= Y_MAX; y++)
            estUnPoint[x][y] = false;
   
      Scanner entrée = new Scanner(System.in);
      int nbPoints = entrée.nextInt();
      Point points[] = new Point[nbPoints];
      for (int point = 0; point < nbPoints; point++)
      {
         
         int x = entrée.nextInt();
         int y = entrée.nextInt();
         points[point] = new Point(x,y);
         estUnPoint[ points[point].x ][ points[point].y ] = true;
      }
   
      int nbMilieux = 0;
      for (int milieu = 0; milieu < nbPoints; milieu++)
      {
         int deuxXMilieu = 2 * points[milieu].x;
         int deuxYMilieu = 2 * points[milieu].y;
         for (int point = 0; point < nbPoints; point++)
            if (point != milieu)
            {
               int x = deuxXMilieu - points[point].x;
               if ((x < 0) || (x > X_MAX)) continue;
               int y = deuxYMilieu - points[point].y;
               if ((y < 0) || (y > Y_MAX)) continue;
               if (estUnPoint[x][y])
               {
                  nbMilieux++;
                  break;
               }
            }
         }
      System.out.println(nbMilieux);
   }
}