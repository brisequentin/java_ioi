import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      
      while(n!=1){
         if (n%2==0){
            n /= 2;
            System.out.print(n+" ");
         } else {
            n = n*3+1;
            System.out.print(n+" ");
         }
      }
   }
}