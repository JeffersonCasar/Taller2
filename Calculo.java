public class Calculo extends Thread{

    private int numero;
    public int resultado;
    
    public Calculo(int numero) {
        this.numero = numero;
    }
    
    public int getResultado() {
        return resultado;
    }
    
    @Override
    public void run() {
      resultado = Calculo(numero);
    }

    public int Calculo(int numero){
        if (numero == 1) {
            return 0;
        }
        if (numero==2){
            return 1;
        }    
        return Calculo(numero-1) + Calculo(numero-2);
    }
}
