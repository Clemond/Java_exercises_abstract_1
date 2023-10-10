public class Main{
    public static void main(String[] args) {
        // Skapa en abstract klass som heter Shape, i den klassen skapar du en abstract metod 
        // som heter calculateArea(). Skapa två subklasser som heter Circle och Rectangle som 
        // extends Shape och lös att vi kan räkna ut arean.

        Circle circle1 = new Circle();
        Rectangel rectangel1 = new Rectangel();

        circle1.calculateAreaOnCircle(5);

        rectangel1.calculateAreaOnRectangel(2, 6);
        
    }
}