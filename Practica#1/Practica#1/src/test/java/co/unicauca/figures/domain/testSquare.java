package co.unicauca.figures.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Pruebas unitarias para la clase {@link Square}.
 *
 * @author Juan Sebastian Ceron Paz
 * @author Edier Fabian Dorado
 */
public class testSquare {

    @Test
    public void testPerimeter() {
        Square sq = new Square(2);
        assertEquals(8.0, sq.calculatePerimeter(), 0.01);
    }
    @Test
    public void testArea() {
        Square sq = new Square(3);
        assertEquals(9.0, sq.calculateArea(), 0.01);
    }
}

