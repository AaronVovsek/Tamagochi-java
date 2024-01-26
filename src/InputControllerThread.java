import java.util.Scanner;
public class InputControllerThread extends Thread {
    InputControllerThread(){
    start();
    }
    @Override
    public void run(){
        Scanner input=new Scanner(System.in);
        while (App.tamagochi.itsAlive()) {
            int controller = input.nextInt();
            switch (controller) {
                case 1:
                    App.tamagochi.Alimentar();
                    break;

                case 2:
                    App.tamagochi.Hidratar();
                    break;

                case 3:
                    App.tamagochi.Dormir();
                    break;
            
                default:
                    break;
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
