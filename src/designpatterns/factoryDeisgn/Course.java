package designpatterns.factoryDeisgn;

import java.util.ArrayList;
import java.util.List;

public abstract class Course {
    protected List<Module> modules = new ArrayList<>();

    public List<Module> getModules() {
        return modules;
    }
    //This will be implemented by the child classes
    public abstract void createCourse();
}
