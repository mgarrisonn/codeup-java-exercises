public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        float MyFavoriteNumber = 34;
        System.out.println(MyFavoriteNumber);

        String MyString = "3.14159";
        System.out.println(MyString);

        float myNumber = 3.14f;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        String theNumberThree = "three";
        System.out.println(theNumberThree);
        Object o = theNumberThree;
        System.out.println(o);
//        int three = (int) o;

//        int x = 4;
//        x += 5;
//
//        int x = 3;
//        int y = 4;
//        y *= x;
//
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;

        byte randomNumber = 127;
        System.out.println(++randomNumber);
        System.out.println(++randomNumber);

        byte num = 127;
        System.out.println(num + 10);

        short otherNumber = 32767;
        System.out.println(++otherNumber);

        System.out.println(randomNumber + otherNumber);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);

    }
}
