package designpatterns.creationsal.factoryDeisgn;

public class LLDCourse extends Course {
    @Override
    public void createCourse() {
        modules.add(new IntroModule());
        modules.add(new ExerciseModule());
        modules.add(new SummaryModule());
    }
}
