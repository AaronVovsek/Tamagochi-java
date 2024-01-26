
public class GraphicsThread extends Thread {

    @Override
    public void run(){
        while (App.tamagochi.itsAlive()) {
            drawmenu();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    GraphicsThread(){
  
        start();
    
    }
    
    private static void drawmenu(){
        int line=20;
       for (int i = 0; i < line; i++) {
           System.out.print("#");

       }
       System.out.println();
       System.out.println("nombre: "+App.tamagochi.getNombre());
       System.out.println("comida: "+App.tamagochi.getAlimentar());
       System.out.println("agua: "+App.tamagochi.getHidratar());
       System.out.println("sueño: "+App.tamagochi.getDormir());
       for (int i = 0; i < line; i++) {
           System.out.print("-");
       }
       System.out.println();
       System.out.println("1- alimentar: ");
       System.out.println("2- hidratar ");
       System.out.println("3- dormir ");
       for (int i = 0; i < line; i++) {
       System.out.print("#");
       }System.out.println();
   }
}

