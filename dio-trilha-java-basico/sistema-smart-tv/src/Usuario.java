public class Usuario {

    public static void main (String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        smartTv.aumentarVolume(1);
        smartTv.aumentarCanal(1);
        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);






    }
}
