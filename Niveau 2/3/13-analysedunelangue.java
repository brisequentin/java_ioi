import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      char letter = entree.next().charAt(0);
      int n = entree.nextInt();
      int counter = 0;
      for (int i=0; i<n; i++){
         String line = entree.nextLine();
         for (int v=0; v<line.length(); v++){
            if (line.charAt(v)== letter){
               counter += 1;
            }
         }
      }
      System.out.println(counter);
   }
}