import java.io.IOException;
class Main {
   public static void main(String[] args) throws IOException {
      inverse();
   }
   private static void inverse() throws IOException {
      int caractère = System.in.read();
      if (caractère != '\n')
      {
         inverse();
         System.out.print((char)caractère);
      }
   }
}