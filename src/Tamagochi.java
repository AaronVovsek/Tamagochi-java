public class Tamagochi extends Thread{
    private String nombre;
    private int comida;
    private int agua;
    private int sueño;
    private boolean vivo;

    Tamagochi(String Nombre){
        this.nombre = Nombre;
        this.comida = 100;
        this.agua = 100;
        this.sueño = 100;
        this.vivo  = true;
        this.start();
    }
    public String getNombre(){
    return this.nombre;
    }
    
    public void setNombre(String value){
        this.nombre = value; 
    }

    public int getAlimentar(){
        return this.comida;
    }

    public void Alimentar(){
        this.comida += 25;
    }

    public int getHidratar(){
        return this.agua;
    }
    
    public void Hidratar(){
        this.agua += 25;
    }

    public int getDormir(){
        return this.sueño;
    }
    
    public void Dormir(){
        this.sueño += 25;
    }

    public boolean itsAlive(){
        return this.vivo;
    }



    @Override
    public void run(){
        while (true) {
            if(this.comida <= 0 || this.agua <= 0 || this.sueño <= 0){ 
                this.die();
                break;
            }
            this.comida -=10;
            this.agua -=10;
            this.sueño -=10;
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void die(){
        this.vivo = false;
        System.out.println("se muriooooooo: ");
    }
}