public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 0;

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(int valor){
        volume=volume+valor;

    }
    public void diminuirVolume(int valor){
        volume=volume-valor;

    }

    public void aumentarCanal(int valor){
        canal=canal+valor;
    }
    public void diminuirCanal(int valor){
        canal = canal-valor;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }





}
