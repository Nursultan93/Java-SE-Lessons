package break_continue;

import java.util.Random;

public class BreakExample {

  Random random = new Random();

  public static void main(String[] args) {

    BreakExample b = new BreakExample();

    int [] array = new int[10];

    array = b.getArray(array.length);

    for (int i=0; i<array.length; i++) {

      System.out.print(array[i]+" ");

    }
    System.out.println();

    for (int i=0; i<array.length; i++) {

      if (array[i]%2==0){
        System.out.println(array[i]);
        break;
      }

    }

  }


  private int[] getArray(int size) {

    int [] a = new int[size];

    for (int i=0; i<size; i++) {
      a[i] = random.nextInt(10);
    }

    return a;
  }


}
