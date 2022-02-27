import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      int min = entree.nextInt();
      int max = entree.nextInt();
      int cont = 2;
      
      for (int i=1; i<=n; i++){
         int m = entree.nextInt();
         if (min <= m && m<=max && cont ==2){
            System.out.println("Rien à signaler");
         } else if (!(min <= m && m<=max)&& cont==2) {
            System.out.println("Alerte !!");
            cont -= 1;
         }
      }

      
   }
}