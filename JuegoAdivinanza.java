import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {

    private int numeroAdivinar;
    private int intentos;
    private boolean juegoActivo;

    public JuegoAdivinanza(int intentos, int rango) {
        this.numeroAdivinar = generarNumeroAdivinar(rango);
        this.intentos = intentos;
        this.juegoActivo = true;
    }

    private int generarNumeroAdivinar(int rango) {
        Random random = new Random();
        return random.nextInt(rango) + 1;
    }

    public void start() {
        System.out.println("Adivina el numero entre 1 y 100. Tienes " + intentos + " intentos.");
        Scanner scanner = new Scanner(System.in);
        while (intentos > 0 && juegoActivo) {
            System.out.print("Introduce tu numero: ");
            int numero = scanner.nextInt();
            Thread hiloAdivinanza = new Thread(new Runnable() {
                @Override
                public void run() {
                    if (numero == numeroAdivinar) {
                        System.out.println("Felicidades Has adivinado el numero");
                        juegoActivo = false;
                    } else if (numero > numeroAdivinar) {
                        System.out.println("El numero es menor.");
                        intentos--;
                    } else if (numero < numeroAdivinar) {
                        System.out.println("El numero es mayor.");
                        intentos--;
                    }
                }
            });
            hiloAdivinanza.start();
        }
        if (intentos == 0) {
            System.out.println("Lo siento Has agotado tus intentos. El numero era " + numeroAdivinar);
        }
        scanner.close();
    }
}
