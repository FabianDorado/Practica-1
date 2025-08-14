package co.unicauca.figures.domain;
/**
 * Representa un triángulo, que puede inicializarse con base y altura,
 * o con los tres lados. Implementa la interfaz {@link Figure}.
 *
 * @author Juan Sebastian Ceron Paz
 * @author Edier Fabian Dorado
 */
public class Triangle implements Figure {
    private final double base;
    private final double altura;
    private final double lado1;
    private final double lado2;
    private final double lado3;
    /**
     * Constructor para triángulo isósceles dado base y altura.
     *
     * @param base longitud de la base
     * @param altura altura del triángulo
     */
    public Triangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.lado1 = base;
        this.lado2 = Math.sqrt(Math.pow(base / 2, 2) + Math.pow(altura, 2));
        this.lado3 = lado2; // Triángulo isósceles
    }
    /**
     * Constructor para triángulo con tres lados conocidos.
     *
     * @param lado1 primer lado
     * @param lado2 segundo lado
     * @param lado3 tercer lado
     */
    public Triangle(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        double s = (lado1 + lado2 + lado3) / 2; // semiperímetro
        this.base = lado1;
        // Fórmula de Herón para calcular la altura
        this.altura = (2 / lado1) * Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
    @Override
    public double calculatePerimeter() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public double calculateArea() {
        return (base * altura) / 2;
    }
}
