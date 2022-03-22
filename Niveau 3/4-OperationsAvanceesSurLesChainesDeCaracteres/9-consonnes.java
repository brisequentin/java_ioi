class Main{
   public static void main(String[] args){
      char[] comp = {'a','e','i','o','u','y'};
      
      for(int i=97; i<=122; i++){
         boolean bool = true;
         for(char c : comp){
            if ((char)i == c){
               bool = false;
            }
         }
         if (bool){
            System.out.print((char)i+" ");
         }   
      }
   }
}