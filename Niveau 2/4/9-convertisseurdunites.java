import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      
      for (int i=0; i<n; i++){
         double val = entree.nextDouble();
         char unite = entree.next().charAt(0);
         switch(unite){
            case 'm':
               System.out.println(val/0.3048+" p");
               break;
            case 'g':
               System.out.println(val*0.002205+" l");
               break;
            case 'c':
               System.out.println(32+1.8*val+ " f");
               break;
            case 'p':
               System.out.println(val*0.3048+" m");
               break;
            case 'l':
               System.out.println(val/0.002205+" g");
               break;
            case 'f':
               System.out.println((val-32)/1.8+" c");
               break;
         }
      }
   }
}