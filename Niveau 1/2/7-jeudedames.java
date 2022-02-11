class Main {
    public static void main(String[] args){
       for (int i=1; i<=20; i++){
          for (int j=1; j<=20; j++){
             System.out.print("O");
             System.out.print("X");
          }
          System.out.println();
 
          for (int j=1; j<=20; j++){
             System.out.print("X");
             System.out.print("O");
          }
          System.out.println();
       }
    }
 }