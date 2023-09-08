package stream_api.desafio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class desafio3 {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numeros2 = new ArrayList<>(numeros);

        for (Integer integer : numeros) {
            numeros2.removeIf(n -> n%2 != 0);
        }
        System.out.println(numeros2);
    }
}
