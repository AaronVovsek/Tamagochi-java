import java.util.Scanner;
public class App extends Thread {
public static Tamagochi tamagochi;   
    public void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        System.out.println("ingrese un nombre:");
        String nombre = input.next();
        tamagochi=new Tamagochi(nombre);
        GraphicsThread graphicsThread = new GraphicsThread();
        InputControllerThread inputControllerThread = new InputControllerThread();
    }
    

    
}
