package tasksStudentScore;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Nigar", "Afandiyeva");
        Employee emp2 = new Employee("Vahid", "Rasulov");
        Employee emp3 = new Employee("Arzu", "Mammadova");

        Employee[] employee = new Employee[3];
        employee[0] = emp1;
        employee[1] = emp2;
        employee[2] = emp3;

        for (Employee e: employee){
            System.out.println(e.getName() + e.getSurname());
        }


//        Student s1 = new Student("Huseyn", 25, 97);
//        Student s2 = new Student("Eli", 23, 56);
//        Student s3 = new Student("Arzu", 27, 44);
//
//        Student[] array = new Student[3];
//        array[0] = s1;
//        array[1] = s2;
//        array[2] = s3;
//
//
//        for (Student student: array){
//            student.printInfo();
//        }


    }


}
