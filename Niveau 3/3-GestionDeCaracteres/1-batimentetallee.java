import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int bat = (int)(entree.next().charAt(0)-64);
      char allee = (char)(entree.nextInt()+64);
      
      System.out.println(bat+""+allee);
   }
}