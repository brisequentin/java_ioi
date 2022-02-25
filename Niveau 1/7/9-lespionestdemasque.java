import algorea.Scanner;

class Main {
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      int counter;
      for (int i=1; i<=n; i++){
         int taille = entree.nextInt();
         int age = entree.nextInt();
         int poids = entree.nextInt();
         int cheval = entree.nextInt();
         int cheveuxbrun = entree.nextInt();
         counter = 0;
         
         if (taille>=178 && taille<=182){
            counter += 1;
         } 
         if (age>=34){
            counter += 1;
         }
         if (poids<70){
            counter += 1;
         }
         if (cheval==0){
            counter += 1;
         }
         if (cheveuxbrun==1){
            counter += 1;
         }

         
         switch (counter){
            case 0:
               System.out.println("Impossible");
               break;
            case 1: case 2:
               System.out.println("Peu probable");
               break;
            case 3: case 4: 
               System.out.println("Probable");
               break;
            case 5:
               System.out.println("Très probable");
               break;
         }
         
      }
   }
}   