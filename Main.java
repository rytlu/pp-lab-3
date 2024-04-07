import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        
        Circle[] circles = new Circle[2];
        circles[0] = new Circle(new Point(0, 0), 3);
        circles[1] = new ColoredCircle(new Point(1, 1), 2, "czerwony");

        for (Circle circle : circles) {
            System.out.println("Pole powierzchni koła = " + circle.getArea());

            if (circle instanceof ColoredCircle) {

                ColoredCircle coloredCircle = (ColoredCircle) circle;
                System.out.println("Kolor koła: " + coloredCircle.getColor());
            }
        }
        
    }
}
 