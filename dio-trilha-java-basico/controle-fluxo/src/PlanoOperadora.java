import java.util.Scanner;

// Modo condicional switch/case
public class PlanoOperadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("T, M ou B:");
        System.out.println("Digite:");
        String plano = scanner.next();

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}