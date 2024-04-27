package calculadora.operaciones;

public abstract class operacion {
    private double perimetro;
    private double area;

    public operacion(double perimetro, double area ) {
        this.perimetro = perimetro;
        this.area = area;
    }

    public  double get_Perimetro() {
        return this.perimetro;
    }

    public double get_area() {
        return this.area;
    }

    public void set_Perimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void set_area(double area) {
        this.area = area;
    }

    public abstract void calcular_perimetro();

    public abstract void calcular_area();
}