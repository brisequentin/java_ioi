import algorea.Scanner;
class Main {
   static Scanner entree= new Scanner(System.in);
   public static void main(String[] args) {
      int max = entree.nextInt();
      int min = entree.nextInt();
      int volume = 0;
      
      for (int i=max; i>=min; i--){
         volume += i*i;
      }
      System.out.println(volume);
   }
}