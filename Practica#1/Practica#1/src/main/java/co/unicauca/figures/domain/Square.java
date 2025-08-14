package co.unicauca.figures.domain;
/**
 * Representa un cuadrado con un lado específico.
 * Implementa la interfaz {@link Figure}.
 *
 * @author Juan Sebastian Ceron Paz
 * @author Edier Fabian Dorado
 */
public class Square implements Figure {
    private double lado;
    /**
     * Constructor que inicializa el lado del cuadrado.
     *
     * @param lado longitud del lado
     */
    public Square(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    /**
     * Calcula el perímetro del cuadrado.
     *
     * @return perímetro
     */
    @Override
    public double calculatePerimeter() {
        return lado * 4;
    }
    /**
     * Calcula el área del cuadrado.
     *
     * @return área
     */
    @Override
    public double calculateArea() {
        return lado * lado;
    }
}