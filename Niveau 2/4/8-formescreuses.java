import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n1 = entree.nextInt();
      int n2 = entree.nextInt();
      int n3 = entree.nextInt();
      int n4 = entree.nextInt();
      
      ligne(n1);
      System.out.println();
      rect(n2,n3);
      triangle(n4);
   }
   
   static void ligne(int n){
      for(int i=0; i<n; i++){
         System.out.print("X");
      }
      System.out.println();
   }
   
   static void rect(int y,int n){
      for(int i=0; i<y; i++){
         for (int v=0; v<n; v++){
            if (i==0 || i==y-1){
               System.out.print("#");
            } else if (v==0 || v==n-1){
               System.out.print("#");
            } else {
               System.out.print(" ");
            }
         }
         System.out.println();
      }
   }
   
   static void triangle(int n){
      for (int i=0; i<n; i++){
         for(int v=0; v<i; v++){
            if (v==0 || v==i-1){
               System.out.print("@");
            } else {
               System.out.print(" ");
            }
         }
         System.out.println();
      }
      for (int i=0; i<n; i++){
         System.out.print("@");
      }
   }
   
}