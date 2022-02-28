import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      for (int i=1; i<=n; i++){
      double poids = entree.nextDouble();
      entree.nextDouble();
      double prix = entree.nextDouble();
      
      System.out.println(prix/poids);
      }
   
      }
}