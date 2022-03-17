import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      
      for (int i=0; i<n; i++){
         String livre = entree.nextLine();
         if(palindrome(livre)){
            System.out.println(livre);
         }
      }
   }
   
   static boolean palindrome(String livre){
      char[] tLivre = livre.toUpperCase().toCharArray();
      int len = tLivre.length;
      
      int x = 0;
      int y = len-1;
      for (int i=0; i<len; i++){
         while(tLivre[x]==' '){
            x++;
         }
         while(tLivre[y]==' '){
            y--;
         }
         if(y<=x){
            return(true);
         }
         if (tLivre[x]!=tLivre[y]){
            return(false);
         } else {
            x++;
            y--;
         }
         
      }
      return(true);
   }
}