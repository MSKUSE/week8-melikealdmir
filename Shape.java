public class Shape {
    private String color="white";
    public Shape (){

    }


    private double area (){
        return 0.0;
    }

    public Shape(String color) {
        this.color = color;
    }

    private double area(){
        return 0.0;
    }


    public double perimeter(){
        return 0.0;
    }

    public void describe (int sideA, int sideB){
        System.out.println("Side a is"+sideA
                + "Side  B is"+sideB);
    }
    public void describe (int sideA){
        System.out.println("Side a is"+sideA);
    }

    public void describe (int sideA) {
        System.out.println("Radius is" + sideA);
    }
    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public void describe() {
        System.out.println("Rectangle with sides: " + sideA + ", " + sideB + " and color: " + super.getColor());
    }
}

