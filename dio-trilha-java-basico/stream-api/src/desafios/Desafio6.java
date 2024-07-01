package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> maiorQueDez = numero -> numero > 10;

        boolean maiorDez = numeros.stream()
                .anyMatch(n-> n >10);
        System.out.println(maiorDez);



    }
}
