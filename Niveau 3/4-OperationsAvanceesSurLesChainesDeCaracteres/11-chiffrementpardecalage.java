import algorea.Scanner;
class Main
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      int nbPages = input.nextInt();
      for (int page = 2; page <= nbPages; page = page + 1)
      {
         int decalage;
         if (page % 2 == 0)
         {
            decalage = -3 * page;
         }
         else
         {
            decalage = 5 * page;
         }
         decalage = decalage % 26;
         StringBuffer texte = new StringBuffer(input.nextLine());
         for (int iCar = 0; iCar < texte.length(); iCar = iCar + 1)
         {
            char caractere = texte.charAt(iCar);
            if (Character.isLetter(caractere))
            {
               boolean isMaj = Character.isUpperCase(caractere);
               if (isMaj)
               {
                  caractere = Character.toLowerCase(caractere);
               }
               /*
               Attention, le modulo en Java peut donner un résultat négatif, compris
               entre -25 et 0. D’où le +26 (pour le rendre positif à coup sûr) et le
               nouveau modulo ensuite.
               */
               int numero = ((caractere - 'a' + decalage) % 26 + 26) % 26;
               caractere = (char)(numero + 'a');
               if (isMaj)
               {
                  caractere = Character.toUpperCase(caractere);
               }
               texte.setCharAt(iCar, caractere);
            }
         }
         System.out.println(texte);
      }
   }
}