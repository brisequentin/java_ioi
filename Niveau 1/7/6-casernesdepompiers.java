import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
   
      int n = entree.nextInt();
      for (int i=1; i<=n; i++){
         int xmin1 = entree.nextInt(); 
         int xmax1 = entree.nextInt();
         int ymin1 = entree.nextInt();
         int ymax1 = entree.nextInt();
         
         int xmin2 = entree.nextInt();
         int xmax2 = entree.nextInt();
         int ymin2 = entree.nextInt();
         int ymax2 = entree.nextInt();
         
         if ( (xmax1 <= xmin2) || (xmax2 <= xmin1)  || (ymax1 <= ymin2) || (ymax2 <= ymin1) ){
            System.out.println("NON");
         } else {
            System.out.println("OUI");
         }
     }
   }
}