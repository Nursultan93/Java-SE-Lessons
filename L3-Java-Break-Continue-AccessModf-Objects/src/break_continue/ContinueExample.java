package break_continue;

import java.util.Random;

public class ContinueExample {

  public static void main(String[] args) {

    int [] array = new int[5];
    array[0] = 9;
    array[1] = 4;
    array[2] = 5;
    array[3] = 0;
    array[4] = 3;

    for (int i=0; i<array.length; i++){

      if (array[i] == 0){
        continue;
      }
      System.out.print(array[i]+" ");
    }

  }


}
