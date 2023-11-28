package designpatterns.creationsal.factoryDeisgn;

public class DemoClient {
    public static void main(String[] args) {

        Course LLD =  CourseFactory.getCourse("LLD");
        Course HLD =  CourseFactory.getCourse("HLD");

        assert LLD != null;
        System.out.print("LLD Modules : ");
        System.out.println(LLD.modules);

        assert HLD != null;
        System.out.print("HLD Modules : ");
        System.out.println(HLD.modules);
    }
}
