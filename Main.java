import geometry.Rectangle;
public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 5);

        
        System.out.println("Wartości prostokąta:");
        System.out.println("Długość: " + rectangle.getLength());
        System.out.println("Szerokość: " + rectangle.getWidth());
        System.out.println("Pole prostokąta: " + rectangle.calculateArea());
        System.out.println("Obwód prostokąta: " + rectangle.calculatePerimeter());
        
    }
} 
