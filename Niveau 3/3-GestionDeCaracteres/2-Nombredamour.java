import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      char[] nom1 = entree.next().toCharArray();
      char[] nom2 = entree.next().toCharArray();
     
      int n1 = 0;
      int n2 = 0;
      int temp = 0;
      
      for (char c : nom1){
         n1 += (int)c-65;
      }
      for (char c : nom2){
         n2 += (int)c-65;
      }
      while(n1>9){
         temp += n1%10;
         n1 /=10;
         if (n1<9){
            n1 = temp + n1;
            temp = 0;
         }
      }
      while(n2>9){
         temp += n2%10;
         n2 /=10;
         if (n2<9){
            n2 = temp + n2;
            temp = 0;
         }
      }
      
      
      System.out.println(n1+" "+n2);
   }
}