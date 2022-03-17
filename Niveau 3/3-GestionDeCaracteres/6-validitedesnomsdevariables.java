import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      
      for (int i=0; i<n; i++){
         System.out.println(isGood(entree.nextLine()));
         
      }  
      
       
   }
   
   static String isGood(String var){
      for (int v=0; v<var.length(); v++){
      
            if(v==0){
               if( !(Character.isLetter(var.charAt(0)) || var.charAt(0) == '_') ){
                  return("NO");
               }
            } else {
               if( !(Character.isLetter(var.charAt(v)) || var.charAt(v) == '_' || Character.isDigit(var.charAt(v))) ){
                     return("NO");
                  }
            } 
         }
         return("YES");
   }
}