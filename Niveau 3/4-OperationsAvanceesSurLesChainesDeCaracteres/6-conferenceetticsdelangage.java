import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      String sample = entree.next();
      int counter = 0;
      boolean alright = true;
      
      while(alright){
         try{
            if(sample.equals(entree.next().toLowerCase())){
               counter+=1;
            }
         } catch(Exception e){
            alright=false;
         }
      }
      System.out.println(counter);
   }
}