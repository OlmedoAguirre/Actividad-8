package calculadora.operaciones;

public class Triangulo extends operacion {
    private   double lado2;
    private double lado3;
    private double altura;
    public Triangulo(double perimetro, double area, double lado2, double lado3, double altura) {
        super(perimetro, area);
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
    }



    @Override
    public void calcular_perimetro() {
        double perimetro = get_Perimetro() + lado2 + lado3;
        set_Perimetro(perimetro);

        System.out.println("El perimetro del triangulo es: " + get_Perimetro());
    }
    @Override
    public void calcular_area() {
        double area = (get_area() * altura) / 2;
        set_area(area);

        System.out.println("El area del triangulo es: " + get_area());

    }
}