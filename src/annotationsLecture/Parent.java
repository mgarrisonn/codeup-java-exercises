package annotationsLecture;

@SuppressWarnings("all")

public class Parent {

    public void theMethodToSayWhatItIs() {
        System.out.println("I am the parent!");
    }

    @Deprecated
    public static void oldMethod() {
        System.out.println("Old way of doing things...");
    }

    public static void newMethod() {
        System.out.println("New way of doing things...");
    }

}
