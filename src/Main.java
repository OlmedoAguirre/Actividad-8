package calculadora;

import calculadora.operaciones.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        boolean R = true;

        while (R) {
            try {
                yapping();
                short e = sc.nextShort();

                switch (e) {
                    case 1:
                        case1();
                        break;
                    case 2:
                        case2();
                        break;
                    case 3:
                        case3();
                        break;
                    case 4:
                        case4();
                        break;
                    case 5:
                        case5();
                        break;
                    default:
                        System.out.println(("Por favor, introduzca una opcion valida"));
                }
            } catch (InputMismatchException x) {
                System.out.println("Por favor, ingresa una opcion valida");
            }
            i++;
            sc.nextLine();
            System.out.println("Desea realizar otra accion? (y/n): ");
            char a = sc.next().charAt(0);
            if (a == 'n') {
                R = false;
            }
        }
    }

    static void yapping() {
        System.out.println("Presione '1' para seleccionar 'circulo' ");
        System.out.println("Presione '2' para seleccionar 'cuadrado' ");
        System.out.println("Presione '3' para seleccionar 'triangulo' ");
        System.out.println("Presione '4' para seleccionar 'rectangulo' ");
        System.out.println("Presione '5' para seleccionar 'pentagono' ");
    }
    static void case1(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el diametro: ");
        double d = sc.nextDouble();

        System.out.print("Introduzca el valor del radio: ");
        double a = sc.nextDouble();

        operacion operacion = new circulo(d,a);
        operacion.calcular_perimetro();
        operacion.calcular_area();
    }

    static void case2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el valor del lado del cuadrado(cm)");
        double d = sc.nextDouble();

        System.out.println("Introduzca el valor del lado del cuadrado(cm)");
        double a = sc.nextDouble();

        operacion operacion = new Cuadrado(d,a);
        operacion.calcular_perimetro();
        operacion.calcular_area();
    }

    static void case3() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el valor del primer lado(cm)");
        double d = sc.nextDouble();

        System.out.println("Introduzca el valor del segundo lado(cm)");
        double t = sc.nextDouble();

        System.out.println("Introduzca el valor del tercer lado(cm)");
        double f = sc.nextDouble();

        System.out.println("Introduzca el valor de la base(cm)");
        double a = sc.nextDouble();

        System.out.println("Introduzca el valor de la altura(cm)");
        double h = sc.nextDouble();

        operacion operacion = new Triangulo(d,a,t,f,h);
        operacion.calcular_perimetro();
        operacion.calcular_area();
    }

    static void case4() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el valor del lado horizontal(cm)");
        double d = sc.nextDouble();

        System.out.println("Introduzca el valor del lado vertical(cm)");
        double t = sc.nextDouble();

        System.out.println("Introduzca el valor de la base(cm)");
        double a = sc.nextDouble();

        System.out.println("Introduzca el valor de la altura(cm)");
        double h = sc.nextDouble();

        operacion operacion = new Rectangulo(d,a,t,h);
        operacion.calcular_perimetro();
        operacion.calcular_area();
    }

    static void case5() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el valor de los lados(cm)");
        double d = sc.nextDouble();

        System.out.println("Introduzca el valor del perimetro(cm)");
        double a = sc.nextDouble();

        System.out.println("Introduzca el valor de la apotema(cm)");
        double h = sc.nextDouble();

        operacion operacion = new Pentagono(d,a,h);
        operacion.calcular_perimetro();
        operacion.calcular_area();
    }
}
