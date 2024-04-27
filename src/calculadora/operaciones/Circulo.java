package calculadora.operaciones;

public class Circulo extends operacion {
    public Circulo(double perimetro, double area){
        super(perimetro, area);
    }

    @Override
    public void calcular_perimetro(){
        double perimetro = get_Perimetro() *  3.1416;
        set_Perimetro(perimetro);
        System.out.println("El perimetro del circulo es: " + get_Perimetro());
    }

    @Override
    public void calcular_area(){
        double area = (get_area() * get_area()) *  3.1416;
        set_area(area);
        System.out.println("El area del circulo es: " + get_area());
    }
}