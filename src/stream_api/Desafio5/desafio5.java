package stream_api.Desafio5;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class desafio5 {
    public static void main(String[] args) {
        
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    OptionalDouble media = numeros.stream()
    .filter(n -> n > 5)
    .mapToDouble(Integer::doubleValue)
    .average();

    System.out.println(media.getAsDouble());


    }
}