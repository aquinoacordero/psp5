package ejercicio5;

public class Ejercicio5 extends Thread{
    
    public Ejercicio5(String nombre){
        super(nombre);
    }

    public static void main(String[] args){
        Thread hilo1=new Ejercicio5("hilo1");
        Thread hilo2=new Ejercicio5("hilo2");
        hilo2.setPriority(MAX_PRIORITY);
        hilo1.setPriority(MIN_PRIORITY);
        hilo2.start();
        hilo1.start();
    }
    
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hilo: " + getName());
        }
    }
    
}
