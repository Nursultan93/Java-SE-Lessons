package tasksOOP;

import javax.swing.*;

public class TaskOne {
    public static void main(String[] args) {
        int[] i = new int[]{10, 20, 30, 40, 50};

        for(int i1: i){
            int mult = i1 *2;
            System.out.print(mult + ", ");
        }
    }

}
