public class Main {

    public static void main (String[] args){

        
        System.out.print("Ingrese la ruta de la canción: ");
        String archivo = "C:/Users/jeffe/OneDrive/Escritorio/Hilos/billi.wav";

        Cancion cancion = new Cancion(archivo);
        cancion.reproducir();

        System.out.println("La canción se está reproduciendo.\n");

        cancion.detener();


        int numero = 5;
        Calculo calculo = new Calculo(numero);
        calculo.start();

        System.out.println("El resultado del cálculo de Fibonacci para " + numero + " es: " +  calculo.getResultado());

        Himno himno = new Himno("proceso 1"); //llamando los procesos
        himno.start(); //Inicializar 

        JuegoAdivinanza juego = new JuegoAdivinanza(10,100);
        juego.start();


    }
}