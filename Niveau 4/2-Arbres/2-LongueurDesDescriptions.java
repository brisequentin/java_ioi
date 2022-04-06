import algorea.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;
import static java.lang.Math.max;
class Main
{
   static ArrayList< LinkedList<Integer> > fils;
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      int nbCartons = input.nextInt();
      fils = new ArrayList< LinkedList<Integer> > (nbCartons + 1);
      for (int carton = 0; carton <= nbCartons; carton++)
         fils.add(carton,new LinkedList<Integer>());
      for (int carton = 1; carton <= nbCartons; carton++)
         fils.get( input.nextInt() ).add(carton);
         
      System.out.println( hauteur( fils.get(0) ) );
   }
   
   static int hauteur(LinkedList<Integer> arbre)
   {
      if (arbre.size() == 0)
         return 0;
      int maximum = 0;
      for (int carton: arbre)
         maximum = max( maximum, hauteur( fils.get(carton) ) );
      return maximum + 1;
   }
}