import java.util.Scanner;

public class RaizCuadrada extends NumeroNegativoExcepcion{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número entero para obtener su raíz cuadrada: ");

        try {
            double valorIngresado = scanner.nextDouble();

            if (valorIngresado >= 0) {
                double sqrt = Math.sqrt(valorIngresado);
                System.out.println("La raíz cuadrada de " + valorIngresado + " es: " + sqrt);

            } else {
                throw new NumeroNegativoExcepcion("No se puede realizar la operación. " +
                        "Tienes que ingresar un número entero positivo");

            }
        }catch(NumeroNegativoExcepcion e) {
            System.out.println("Error: " + e.getMessage());

        }catch(Exception e) {
            System.out.println("Error tipo: " + e.getMessage() +
                    "\nNo se ingresó un valor numérico");

        }finally {
            scanner.close();

        }
    }
}
    //Beltran Calvo Brayan #222217084