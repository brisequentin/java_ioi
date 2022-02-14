import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int val1 = entree.nextInt();
      int tot1 = 0;
      int tot2 = 0;
      for(int i=1; i<=val1; i++){
         tot1 += entree.nextInt();
         tot2 += entree.nextInt();
      }

      if (tot1>tot2){
         System.out.println("L'équipe 1 a un avantage");
      } else if (tot1<tot2) {
         System.out.println("L'équipe 2 a un avantage");
      }
      System.out.println("Poids total pour l'équipe 1 : "+tot1);
      System.out.println("Poids total pour l'équipe 2 : "+tot2);
   }
}