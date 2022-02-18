import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int age = entree.nextInt();
      int poids = entree.nextInt();
      int prix = 0;
      
      if (age == 60){
         
      } else if (age < 10){
          prix += 5;
      } else {
         if (poids >= 20){
            prix += 10;
         } prix += 30;
      }
       System.out.println(prix);
      
   }
}