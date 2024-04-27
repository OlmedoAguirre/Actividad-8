package calculadora.operaciones;

public class Pentagono extends operacion {
    private double apotema;

    public Pentagono(double perimetro, double area, double apotema) {
        super(perimetro, area);
        this.apotema = apotema;
    }

    @Override
    public void calcular_perimetro() {
        double perimetro = get_Perimetro() * 5;
        set_Perimetro(perimetro);
        System.out.println("El perimetro del Pentagono es: " + get_Perimetro());
    }

    @Override
    public void calcular_area() {
        double area = get_area() * apotema;
        set_area(area);
        System.out.println("El area del Pentagono es: " + get_area());
    }
}