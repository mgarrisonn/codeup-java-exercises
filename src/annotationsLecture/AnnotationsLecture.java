package annotationsLecture;

import java.util.ArrayList;
import java.util.List;


public class AnnotationsLecture {

//    ================================= ANNOTATIONS
//    Meta instructions for the Java compiler or Java applications
//    Can control behaviours at compile-time and at runtime
//    Can create custom annotations (out of scope for today)
//    Common built-in compile time annotations:
//    @Deprecated
//    @Override
//    @SuppressWarnings
//    A number of key/value pairs can be set for a given annotation (called elements)
//    An annotation is normally placed on it's own line above various declarations (classes, methods, properties, and method parameters)
//    Frequently used to configure Java frameworks like JUnit and Spring

    public static int someNum = 3; // WeakerAccess warning
    public static void main(String[] args) {

        Child c = new Child();
        c.theMethodToSayWhatItIs();

        doRiskyThings();

    }


    public static void doRiskyThings() {
        Child c = new Child();
        c.oldMethod(); // deprecation

        List l = new ArrayList();
        l.add("test"); // unchecked warning
        l.add(1);
        for (int i = 0; i < l.size(); i += 1) {
            System.out.println((int) l.get(i) / 2);
        }
    }

}
