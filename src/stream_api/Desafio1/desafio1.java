package stream_api.Desafio1;

import java.util.Arrays;
import java.util.List;


public class desafio1 {
   public static void main(String[] args) {
    
     List<Integer> numeros = Arrays.asList( 2,1,3,5, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


    numeros.stream().sorted()
            .forEach(System.out::println);
   }
    
}
