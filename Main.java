
import geometry.Square;
public class Main {
    public static void main(String[] args) {

        Square square = new Square(5);

        
        System.out.println("Wartości kwadratu:");
        System.out.println("Długość boku: " + square.getLength());
        System.out.println("Szerokość: " + square.getWidth());
        System.out.println("Pole kwadratu: " + square.calculateArea());
        System.out.println("Obwód kwadratu: " + square.calculatePerimeter());
        
    }
} 

 