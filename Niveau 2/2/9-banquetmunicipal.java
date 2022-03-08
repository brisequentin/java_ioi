import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int npos = entree.nextInt();
      int nchange = entree.nextInt();
      
      int[] num = new int[npos];
      
      for (int i=0; i<npos; i++){
         num[i] = entree.nextInt();
      }
      for (int i=0; i<nchange; i++){
         int x = entree.nextInt();
         int y = entree.nextInt();
         int tempx = num[x];
         num[x] = num[y];
         num[y] = tempx;
      }
      
      for (int e : num){
         System.out.println(e);
      }
      
   }
}