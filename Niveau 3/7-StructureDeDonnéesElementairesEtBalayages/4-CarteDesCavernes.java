import algorea.Scanner;
 
class Main
{
   public static void main(String[] args)
   {
      Scanner clavier = new Scanner(System.in);
      int nbCaractères = clavier.nextInt();
      String plan = clavier.nextLine();
      int niveau = 0;
      for (int position = 0; position < nbCaractères; position++)
      {
         int caractère = plan.charAt(position);
         if (caractère == '(')
            niveau += 1;
         else if (caractère == ')')
         {
            niveau -= 1;
            if (niveau < 0)
            {
               System.out.println(0);
               return;
            }
         }
      }
      if (niveau == 0)
         System.out.println(1);
      else
         System.out.println(0);
   }
}