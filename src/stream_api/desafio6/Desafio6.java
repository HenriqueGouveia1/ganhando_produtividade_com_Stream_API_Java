package stream_api.desafio6;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean check = numeros.stream().anyMatch(n -> n>10);

        if (check) {
            System.out.println("tem");
        }
        else{
            System.out.println("nao tem");
        }
    }
}
