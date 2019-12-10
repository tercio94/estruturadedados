package Estruturas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Estruturas {

        public static void main(String[] args) {
                Set<String> nome = new HashSet<>();
                nome.add("Tercio");
                nome.add("Gabriel");
                nome.add("Correa");
                nome.add("Rodrigues");

                System.out.println(nome);

                nome.remove("Rodrigues");
                System.out.println(nome);

                nome.forEach(System.out::println);

                Optional<String> maybeCorrea = nome.stream()
                        .filter(s -> s.equals("Correa"))
                        .findFirst();
                if (maybeCorrea.isPresent()) {
                        System.out.println(maybeCorrea.get());
                }

                maybeCorrea.ifPresent(correa -> System.out.println(correa));

                ArrayList<String> ordenados = new ArrayList<>(nome);
                Collections.sort(ordenados);
                System.out.println(ordenados);
        }

}





