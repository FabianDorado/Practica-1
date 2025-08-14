package co.unicauca.figures.domain;
/**
 * Representa un círculo con un radio específico.
 * Implementa la interfaz {@link Figure}.
 *
 * @author Juan Sebastian Ceron Paz
 * @author Edier Fabian Dorado
 */
public class Circle implements Figure {
    private double radio;
    /**
     * Constructor que inicializa el radio del círculo.
     *
     * @param radio valor del radio
     */
    public Circle(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    /**
     * Calcula el perímetro del círculo.
     *
     * @return perímetro
     */
    @Override
    public double calculatePerimeter() {
        return Math.PI * radio * 2;
    }
    /**
     * Calcula el área del círculo.
     *
     * @return área
     */
    @Override
    public double calculateArea() {
        return Math.PI * radio * radio;
    }
}

