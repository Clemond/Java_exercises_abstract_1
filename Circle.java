public class Circle extends Shape {

    @Override
    public void calculateAreaOnCircle(double radius) {

        System.out.println("arean på circeln är " + ((radius * radius) * Math.PI));
        
    }

    @Override
    public void calculateAreaOnRectangel(int b, int h) {
    }
    
}
