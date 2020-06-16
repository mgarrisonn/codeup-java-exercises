package abstractLecture.animals;

public class Dog extends Animal implements CanWalk, CanSwim {

    @Override
    public void eat() {
        System.out.println("Eats dog food");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps in bed");
    }

    @Override
    public void moveForward() {
        System.out.println("moving forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("moving backward");
    }

    @Override
    public void canCrawl() {
        System.out.println("crawling");
    }

    @Override
    public void swimForward(){
        System.out.println("swimming forward");
    }

    @Override
    public void swimBackwards(){
        System.out.println("swimming backward");
    }

}
