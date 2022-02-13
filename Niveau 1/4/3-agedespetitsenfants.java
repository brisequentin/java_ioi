import algorea.Scanner;
class Main {
   static Scanner entrée = new Scanner(System.in);
   public static void main(String[] args) {
      int ageCadet = entrée.nextInt();
      int ageAine = entrée.nextInt();
      int difference = ageAine - ageCadet;
      System.out.println(difference);
   }
}