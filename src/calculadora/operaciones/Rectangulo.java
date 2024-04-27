package calculadora.operaciones;

public class Rectangulo extends operacion {
    private double vertical;
    private  double altura;

    public Rectangulo(double perimetro, double area, double vertical, double altura) {
        super(perimetro,area);
        this.vertical = vertical;
        this.altura = altura;
    }

    @Override
    public void calcular_perimetro() {
        double perimetro = (get_Perimetro() * 2) + (vertical * 2);
        set_Perimetro(perimetro);
        System.out.println("El perimetro del Rectangulo es: " + get_Perimetro());
    }

    @Override
    public void calcular_area() {
        double area = get_area() * altura;
        set_area(area);
        System.out.println("El area del Rectangulo es: " + get_area());
    }
}
