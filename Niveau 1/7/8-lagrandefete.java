import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int Debut = entree.nextInt();
      int fin = entree.nextInt();
      
      int counter = 0;
      
      int n = entree.nextInt();
      for(int i=1; i<=n; i++){
         int tempdebut = entree.nextInt();
         int tempfin = entree.nextInt();
         if ( !(tempfin<Debut) || !(tempdebut>fin) ){
            counter +=1;
         } 
      }
    System.out.println(counter);
   }
}   