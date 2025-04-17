public class Rectangle extends Shape {

    private int sideA=0,sideB=0;

    public Rectangle(int sideA) {
        this.sideA = sideA;
    }

    public Rectangle(String color, int sideB) {
        super(color);
        this.sideB = sideB;
    }
    @Override
    public void describe (){
        System.out.println("Side A is "+
                this.sideA+"sideB is "+);
    }

    @Override
    public boolean equals (Rectangle r ){
        Rectangle r =(Rectangle) obj;
        if(this.sideA==r.sideA && this.sideB==r.sideB);
        return true;
    }
    else{
        return false;
    }
}
