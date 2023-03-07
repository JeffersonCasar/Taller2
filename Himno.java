import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Himno extends Thread {
    
    public Himno (String mensaje2){
        super(mensaje2);
    }


    @Override
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Himno.txt"));
            String linea;

            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
                Thread.sleep(100); // Pausa de un segundo entre cada línea
            }
            reader.close(); 
        }catch (IOException | InterruptedException e) {
            System.out.println("Error al reproducir el himno.");
        }
    }

}
