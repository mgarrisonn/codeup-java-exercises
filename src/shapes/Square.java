package shapes;

public class Square extends Rectangle{


    public Square(double side){
        super(side, side);
    }

    @Override
    public double getArea(){
        System.out.println("overridden in square");
        return Math.pow(this.length, 2);
    }

    @Override
    public double getPerimeter(){
        return 4 * this.length;
    }

}
