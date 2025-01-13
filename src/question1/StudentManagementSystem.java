package question1;

public class StudentManagementSystem {
    public static void main(String[] args) {

        Student student1 = new Student("ABC",1);
        Student student2 = new Student("DEF",2);

        try{
            student1.setAge(3);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


        try{
            student2.setAge(30);
            student2.displayStudentDetails();
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
