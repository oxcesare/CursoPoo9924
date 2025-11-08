package com.mx.curso.algoritmos;

import java.util.Map;
import java.util.stream.Collectors;

public class TestCodingQuestion {

    public static void main(String[] args) {


        String s = "abbca";


        Map<Character, Long> frequencyMap =
                s.chars().mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(frequencyMap);


    }
}
