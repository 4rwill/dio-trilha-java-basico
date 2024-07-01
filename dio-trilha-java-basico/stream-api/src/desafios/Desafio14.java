package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(Desafio14::isPrime) // Filtra números primos
                .max(Integer::compareTo); // Encontra o maior primo

        maiorPrimo.ifPresentOrElse(
                primo -> System.out.println("O maior número primo é: " + primo),
                () -> System.out.println("Não há números primos na lista")
        );
    }

    // Método auxiliar para verificar se um número é primo
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
