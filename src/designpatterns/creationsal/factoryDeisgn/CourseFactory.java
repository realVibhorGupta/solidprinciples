package designpatterns.creationsal.factoryDeisgn;

public class CourseFactory {

    public static Course getCourse(String courseType) {
        return switch (courseType) {
            case "LLD" -> new LLDCourse();
            case "HLD" -> new HLDCourse();
            default -> null;
        };
    }
}
