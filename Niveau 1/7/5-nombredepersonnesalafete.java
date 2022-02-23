import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      
      int tracker = 0;
      int max = 0;
      
      int input;
      
      for(int i=1; i<=2*n; i++){
         input = entree.nextInt();
         if ( input >=0 ){
            tracker += 1;
         } else {
            tracker -= 1;
         }
         if (tracker > max){
            max = tracker;
         }
      }
      System.out.println(max);
   }
}