package annotationsLecture;

import java.util.ArrayList;
import java.util.List;

public class AnnotationsLecture {

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
