import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      String p1 = entree.nextLine();
      String p2 = entree.nextLine();
      
      int i = 0;
      boolean isOn = true;
      while(isOn){
         int lp1 = p1.length();
         int lp2 = p2.length();
         if ( i == lp1 && i == lp2){
            System.out.println('=');
            System.out.println(i);
            isOn = false;
         } else if ( i == lp1 ){
            System.out.println('2');
            System.out.println(i);
            isOn = false;
         } else if ( i == lp2 ){
            System.out.println('1');
            System.out.println(i);
            isOn = false;
         } else if ( p1.charAt(i) < p2.charAt(i)){
            System.out.println('1');
            System.out.println(i);
            isOn = false;
         } else if ( p2.charAt(i) < p1.charAt(i)){
            System.out.println('2');
            System.out.println(i);
            isOn = false;
         }
         i++;
         
         
      }
   }
}