package tasksStudentScore;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Huseyn", 25, 97);

        Student[] array = new Student[5];


        for (int i = 0; i <array.length; i++){
            array[i] = s1.printInfo();
        }
    }
}
