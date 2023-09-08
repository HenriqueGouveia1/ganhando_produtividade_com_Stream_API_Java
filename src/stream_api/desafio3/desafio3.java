package stream_api.desafio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class desafio3 {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numeros2 = new ArrayList<>(numeros);

<<<<<<< HEAD
        
        numeros2.removeIf(n -> n%2 != 0);
        
=======
        for (Integer integer : numeros) {
            numeros2.removeIf(n -> n%2 != 0);
        }
>>>>>>> 4b98e655f3060699ac10412e0205b3a1878ab0c7
        System.out.println(numeros2);
    }
}
