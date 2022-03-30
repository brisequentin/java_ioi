import algorea.Scanner;
import java.util.Arrays;
class Main {
   public static void main(String[] args) {
      Scanner entrée = new Scanner(System.in);
      int nbBlocs = entrée.nextInt();
      int[] densités = new int[nbBlocs];
      for (int bloc = 0; bloc < nbBlocs; bloc++)
         densités[bloc] = entrée.nextInt();
      Arrays.sort(densités);
      int nbQuestions = entrée.nextInt();
      for (int question  = 0; question < nbQuestions; question++)
      {
         int inf = 0;
         int sup = nbBlocs-1;
         int densité = entrée.nextInt();
         while (sup - inf > 1)
         {
            int milieu = (sup + inf) / 2;
            if (densité < densités[milieu])
               sup = milieu;
            else
               inf = milieu;
         }
         if (densité <= densités[inf])
            System.out.println(densités[inf]);
         else if (densités[sup] <= densité)
            System.out.println(densités[sup]);
         else if (densités[sup] - densité < densité - densités[inf])
            System.out.println(densités[sup]);
         else
            System.out.println(densités[inf]);
      }
   }
}