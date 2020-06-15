public class InheritanceAndPolymorphismLecture {

//================================= INHERITANCE AND POLYMORPHISM
//    Oracle Java Tutorial on Inheritance: https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html#:~:text=A%20subclass%20inherits%20all%20the,be%20invoked%20from%20the%20subclass.
//            ----------------- OVERVIEW
//    Inheritance Behavior in Java...
//            - Java allows classes and objects to inherit properties and methods.
//            - Inheritance keeps similar classes from requiring duplicate code and organizes our classes into groups, subgroups, subsubgroups, etc.
//            - The subclass/child class can access all public and protected fields (methods and properties) from its super/parent class.
//            - A subclass can have additional properties and methods that don't exist on the super class.
//            - A class can only extend from one other direct parent.
//            - Classes can keep extending down into more and more specific classes:
//
//    Object
//    can be extended by LivingBeing
//    LivingBeing
//    can be extended by Person
//            Person
//    can be extended by Employee
//            Employee
//    can be extended by Engineer
//            Engineer
//    can be extended by JuniorEngineer
//    etc.
//
//- Constructors are not inherited in Java but parent constructors can be referenced in child constructors.

//    ----------------- ADDING SUBCLASS MEMBERS
//    A child class may have additional fields, in addition to inheriting all public and protected fields from its parent.
//    If no constructors are written explictly, the compiler automatically creates
//    an empty default constructor.
//    If a non-empty parameter constructor is added to a class (parent) and another class extends from it (child), one of following MUST be done:
//            - a default (empty) constructor is added to the parent class
//    OR
//  - a child constructor is added that calls a defined parent constructor using the super keyword
//    If no constructor is added to a parent class, the default constructor is automatically added to the parent class at compile time and will not interfere with what constructors can be defined on one of its child classes.
//    https://stackoverflow.com/questions/7187799/why-default-constructor-is-required-in-a-parent-class-if-it-has-an-argument-ed-c


//    Best practice include an override annotation


// Access Modifiers
// public: accessed in any other class
// protected: accessible to any subclass (child) classes
// package-private: accessible from within package
// private: only accessible


//---------------POLYMORPHISM---------------
// Allows for targeting shared behaviors between different classes by targeting classes by a common ancestor
// Overloading:
// Overriding:



    public static void main(String[] args) {

    }
}
