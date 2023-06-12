
package tasksStudentScore;

public class Student {

    private String name;
    private int age;
    private int score;

    public Student(String name, int age, int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void printInfo(){
        System.out.println(name + ", " + age + ", " + score);
    }

    public void checkResults(){
        if (score >=65){
            System.out.println("Passed");
        }else
            System.out.println("Failed");
    }
}
