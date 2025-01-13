package question1;

public class Student {
    int studentId;
    String name;
    int age;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void displayStudentDetails(){
        System.out.println("Student id :"+studentId);
        System.out.println("Student Name :"+name);
        System.out.println("Student Age :"+age);

    }

    public void setAge(int age){
        if(age < 5 || age >100){
            throw new IllegalArgumentException("age must be 5 to 100");
        }
        this.age=age;
    }

}
