import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   
   public static void main(String[] args){
      int c1;
      int c2 = 1000*1000;
      for(int i=0; i<10; i++){
         c1 = entree.nextInt();
         c2 = min(c1,c2);
      }
      System.out.println(c2);
   }
   
   static int min(int a,int b){
      if (a<b){
         return a;
      } else {
         return b;
      }
   }
}