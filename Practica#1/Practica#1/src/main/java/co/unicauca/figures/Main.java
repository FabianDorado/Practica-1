package co.unicauca.figures;

import co.unicauca.figures.domain.Circle;
import co.unicauca.figures.domain.Figure;
import co.unicauca.figures.domain.Square;
import co.unicauca.figures.domain.Triangle;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal que ejecuta la aplicación.
 * Crea diferentes figuras geométricas, las almacena en una lista
 * y muestra por consola el área y perímetro de cada una.
 *
 * @author Juan Sebastian Ceron Paz
 * @author Edier Fabian Dorado
 */
public class Main {
    public static void main(String[] args) {
        // Crear figuras
        Figure fig1 = new Circle(1);
        Figure fig2 = new Square(2.3);
        Figure fig3 = new Triangle(4.2, 4.5); // base y altura

        // Lista para almacenar las figuras
        List<Figure> figures = new ArrayList<>();
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);

        // Recorrer lista e imprimir resultados
        for (Figure fig : figures) {
            System.out.println("El área es: " + fig.calculateArea());
            System.out.println("El perímetro es: " + fig.calculatePerimeter());
            System.out.println("-------------------");
        }
    }
}


