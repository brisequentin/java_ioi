import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      int etage = 0;
      int cube = 0;
      int i = 1;
      while (cube+i*i<=n){
         cube += i*i;
         i++;
         etage += 1;
      }
      System.out.println(etage);
      System.out.println(cube);
   }
   
}