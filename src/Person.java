public class Person {
    private String name;

    public Person(String name){
        this.setName(name);
    }

    public static void main(String[] args){
        Person michael = new Person( "Michael");
        Person trey = new Person("Trey");

        michael.sayHello();
        System.out.println(michael.getName() + "\n");

        trey.sayHello();
        System.out.println(trey.getName() + "\n");


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }

    public String getName(){
        return this.name;
    }

    public void setName (String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello, my name is ");
    }
}
