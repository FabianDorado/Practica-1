package co.unicauca.figures.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Pruebas unitarias para la clase {@link Circle}.
 *
 * @author Juan Sebastian Ceron Paz
 * @author Edier Fabian Dorado
 */
public class testCircle {

    @Test
    public void testPerimeter() {
        System.out.println("calculate Perimeter");
        Circle circle = new Circle(1);
        double expResult = Math.PI * 2;
        double result = circle.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
    @Test
    public void testArea() {
        System.out.println("calculate Area");
        Circle circle = new Circle(1);
        double expResult = 3.1415;
        double result = circle.calculateArea();
        assertEquals(expResult, result, 0.01);
    }
}

