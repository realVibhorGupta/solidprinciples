package designpatterns.structural.prototype;

public class Main {
    public static void main(String[] args) {
//Cloning should be the responsibility of Class itself
        Student originalStudent = new Student(33, 345, "Vibhor");
        //crate clone

        Student cloneObject = (Student) originalStudent.clone();


    }
}
