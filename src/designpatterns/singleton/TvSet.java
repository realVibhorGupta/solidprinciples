package designpatterns.singleton;

import java.io.ObjectStreamException;

//cloneable,Reflection, Serializable,it can break ff multiple classloaders are loaded the class
public class TvSet {

//    private static final  TvSet  tvSetInstance = new TvSet();
    private static volatile    TvSet  tvSetInstance = new TvSet();

//    private static  volatile TvSet tvSetInstance = null;


    private TvSet() {
        if (tvSetInstance != null) {
            throw new IllegalStateException("Singleton" +
                    " instance already created.");
        }

        System.out.println("TV set Initialised");
    }

    public static TvSet getTvSetInstance() {
        if(tvSetInstance == null ){
            //reflection
            synchronized (TvSet.class){
                if(tvSetInstance == null ){
                    tvSetInstance = new TvSet();
                }
            }
        }
        return tvSetInstance;
    }

    private Object readResolve() throws ObjectStreamException         {
        return tvSetInstance;
    }
    private Object writeReplace() throws ObjectStreamException {
        return tvSetInstance;
    }
    public Object clone() throws CloneNotSupportedException {
        // return INSTANCE
        throw new CloneNotSupportedException();
    }
}

