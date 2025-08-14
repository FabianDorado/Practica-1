package co.unicauca.figures.domain;
/**
 * Interfaz que define el comportamiento común de las figuras geométricas.
 * Cualquier figura debe poder calcular su área y perímetro.
 *
 * @author Juan Sebastian Ceron Paz
 * @author Edier Fabian Dorado
 */
public interface Figure {
    double calculatePerimeter();
    double calculateArea();
}