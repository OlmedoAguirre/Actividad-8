package calculadora.operaciones;

public class Cuadrado extends operacion {
    public Cuadrado(double perimetro, double area) {
        super(perimetro, area);
    }

    @Override
    public void calcular_perimetro(){
        double perimetro = get_Perimetro() + get_Perimetro() + get_Perimetro() + get_Perimetro();
        set_Perimetro(perimetro);
        System.out.println("El perimetro del cuadrado es: " + get_Perimetro());
    }
    @Override
    public void calcular_area() {
        double area = get_area() * get_area();
        set_area(area);
        System.out.println("El area del cuadrado es: " + get_area());
    }
}