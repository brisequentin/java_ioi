import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
   
      int n = entree.nextInt();
      
      for (int i=1; i<=n; i++){
         int x = entree.nextInt();
         int y = entree.nextInt();
         
         if ( !(0<=x && x<=90) || !(0<=y && y<=70)){
            System.out.println("En dehors de la feuille");
         } else {
            //rouge
            if ( 10<=x && x<=85 && 10<=y && y<=55 && !(25<=x && x<=50 && 20<=y && y<=45)){
               System.out.println("Dans une zone bleue");
            } else if (15<=x && x<=85 && !(45<=x && x<=60) && 60<=y && y<=70) {
               System.out.println("Dans une zone rouge");
            } else {
               System.out.println("Dans une zone jaune");
            }

         }
      }
   }
}