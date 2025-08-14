package co.unicauca.figures.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Pruebas unitarias para la clase {@link Triangle}.
 *
 * @author Juan Sebastian Ceron Paz
 * @author Edier Fabian Dorado
 */
public class testTriangle {

    @Test
    public void testArea() {
        Triangle t = new Triangle(4, 3); // base=4, altura=3
        assertEquals(6.0, t.calculateArea(), 0.01);
    }

    @Test
    public void testPerimeter() {
        Triangle t = new Triangle(3, 4, 5);
        assertEquals(12.0, t.calculatePerimeter(), 0.01);
    }
}


