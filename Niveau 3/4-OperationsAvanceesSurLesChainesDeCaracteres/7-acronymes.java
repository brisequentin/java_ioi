import algorea.Scanner;

class Main
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      String acronyme = input.nextLine();
      int nbMots = acronyme.length();
      int nbLivres = input.nextInt();
      for (int iLivre = 0; iLivre < nbLivres; iLivre = iLivre + 1)
      {
         StringBuffer titre = new StringBuffer(input.nextLine().toLowerCase());
         char precedent = ' ';
         int iMot = 0;
         boolean correspondance = true;
         for (int iCar = 0; iCar < titre.length(); iCar = iCar + 1)
         {
            char courant = titre.charAt(iCar);
            if ((precedent == ' ') && (courant != ' '))
            {
               courant = Character.toUpperCase(courant);
               titre.setCharAt(iCar,courant);
               if (correspondance)
                  correspondance = (iMot < nbMots) && (acronyme.charAt(iMot) == courant);
               iMot = iMot + 1;
            }
            precedent = courant;
         }
         if (correspondance && (iMot == nbMots))
            System.out.println(titre);
      }
   }
}