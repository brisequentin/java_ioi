import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      int[] tab = new int[n];
      
      for (int i=0; i<n; i++){
         tab[i] = entree.nextInt();
      }
      for (int i=n-1; i>=0; i--){
         switch(tab[i]){
            case 1:
               System.out.println(2);
               break;
            case 2:
               System.out.println(1);
               break;
            case 3:
               System.out.println(3);
               break;
            case 4:
               System.out.println(5);
               break;
            case 5:
               System.out.println(4);
               break;
         }
      }
   }
}