package com.mx.curso.arreglos;

public class Test05 {

    public static void main(String[] args) {

        String[][][] arr = {{
                {"a", "b", "c"},
                {"d", "e", null}},
                {{"x"}, null},
                {{"y"}},
                {{"z", "p"},{}}};
        System.out.println(arr[0][1][2]);

    }
}
