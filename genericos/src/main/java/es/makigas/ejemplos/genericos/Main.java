package es.makigas.ejemplos.genericos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        list.forEach(item -> {
            System.out.printf("Elemento %d\n", item);
        });
        
        List<String> str = new ArrayList<>();
        str.addAll(Arrays.asList("Hola", "mundo", "muy", "buenas"));
        str.forEach(System.out::println);
    }
    
    public static String repetir(int veces) {
        return IntStream.range(0, veces)
                .mapToObj((_i) -> "Hola")
                .collect(Collectors.joining());
    }
}
