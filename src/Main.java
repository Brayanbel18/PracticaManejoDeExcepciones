import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lectTeclado = new Scanner(System.in);
        int num = 7;
        System.out.println("Escribe un string y te muestro el caracter numero: " + num);

        String entrada = lectTeclado.nextLine();
        caracterEn(entrada, num);
        lectTeclado.close();
    }

    public static void caracterEn(String texto, int numero) {
        try {
            System.out.println("El caracter en la posición: " + numero + " es " + texto.charAt(numero-1));

        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe");

        }
    }
}
    //Beltran Calvo Brayan #222217084