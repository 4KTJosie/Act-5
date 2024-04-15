import java.util.Scanner;

public class CalculadoraGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Pentágono");
        int figura = scanner.nextInt();

        System.out.println("Seleccione la operación:");
        System.out.println("1. Área");
        System.out.println("2. Perímetro");
        int operacion = scanner.nextInt();

        double resultado = 0;

        switch (figura) {
            case 1: // Círculo
                System.out.print("Ingrese el radio: ");
                double radio = scanner.nextDouble();
                if (operacion == 1) {
                    resultado = Math.PI * radio * radio;
                    System.out.println("El área del círculo es: " + resultado);
                } else {
                    resultado = 2 * Math.PI * radio;
                    System.out.println("El perímetro del círculo es: " + resultado);
                }
                break;
            case 2: // Cuadrado
                System.out.print("Ingrese el lado: ");
                double lado = scanner.nextDouble();
                if (operacion == 1) {
                    resultado = lado * lado;
                    System.out.println("El área del cuadrado es: " + resultado);
                } else {
                    resultado = 4 * lado;
                    System.out.println("El perímetro del cuadrado es: " + resultado);
                }
                break;
            case 3: // Triángulo
                System.out.print("Ingrese la base: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura: ");
                double altura = scanner.nextDouble();
                if (operacion == 1) {
                    resultado = 0.5 * base * altura;
                    System.out.println("El área del triángulo es: " + resultado);
                } else {
                    System.out.print("Ingrese el lado 1: ");
                    double lado1 = scanner.nextDouble();
                    System.out.print("Ingrese el lado 2: ");
                    double lado2 = scanner.nextDouble();
                    System.out.print("Ingrese el lado 3: ");
                    double lado3 = scanner.nextDouble();
                    resultado = lado1 + lado2 + lado3;
                    System.out.println("El perímetro del triángulo es: " + resultado);
                }
                break;
            case 4: // Rectángulo
                System.out.print("Ingrese la base: ");
                base = scanner.nextDouble();
                System.out.print("Ingrese la altura: ");
                altura = scanner.nextDouble();
                if (operacion == 1) {
                    resultado = base * altura;
                    System.out.println("El área del rectángulo es: " + resultado);
                } else {
                    resultado = 2 * (base + altura);
                    System.out.println("El perímetro del rectángulo es: " + resultado);
                }
                break;
            case 5: // Pentágono
                System.out.print("Ingrese el lado: ");
                lado = scanner.nextDouble();
                if (operacion == 1) {
                    resultado = (1.0 / 4.0) * Math.sqrt(25 + 10 * Math.sqrt(5)) * lado * lado;
                    System.out.println("El área del pentágono es: " + resultado);
                } else {
                    resultado = 5 * lado;
                    System.out.println("El perímetro del pentágono es: " + resultado);
                }
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }

        scanner.close();
    }
}