package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> menorQueZero = numero -> numero < 0;

        boolean negativo = numeros.stream()
                .anyMatch(n-> n < 0);
        System.out.println(negativo);




    }
}
