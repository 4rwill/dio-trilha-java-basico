package pilares.poo.autodromo;

public class Carro extends Veiculo {
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Carro Ligado");
    }
    private void confereCambio() {
        System.out.println("conferindo câmbio");
    }
    private void confereCombustivel() {
        System.out.println("conferindo combustível");
    }


}
