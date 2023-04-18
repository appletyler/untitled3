public class Main {
    public static void main(String[] args) {
       int x = 20;
       while (x>=1){
           System.out.println(x);
           x-=2;
      }

       for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println("");
        }


        for(int i = 1; i < 10; i++) {
           for(int j = 1; j < 10; j++) {
               System.out.print(i + j + " ");
        }
          System.out.println("");
      }
      for (int i =0; i<=34; i++){
         for (int j =0; j<=34; j++){
           System.out.println(i + j + " ");
     }
     System.out.println("");
  }

        for(int i = 0; i <= 34; i++) { // инициализация, условие, инкремент
            for (int j = 0; j <= 34; j++)
                if (i % 3 == 0) {
                    System.out.println(i);
                    i++;
                }
            }

    }
}