import java.util.Scanner;

class JuegoAdivinanza {
    private int numeroSecreto = 7;

    public void iniciar() {
        Scanner lector = new Scanner(System.in);
        int intento = 0;

        System.out.println("¡Bienvenido al Juego de Adivinanzas!");
        System.out.println("Adivina el número del 1 al 10:");

        while (intento != numeroSecreto) {
            intento = lector.nextInt();

            if (intento == numeroSecreto) {
                System.out.println("¡Felicidades! Adivinaste el número.");
            } else {
                System.out.println("Incorrecto. ¡Sigue intentando!");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        JuegoAdivinanza miJuego = new JuegoAdivinanza();
        miJuego.iniciar();
    }
}