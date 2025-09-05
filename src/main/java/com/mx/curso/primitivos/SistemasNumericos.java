package com.mx.curso.primitivos;

import javax.swing.*;

public class SistemasNumericos {

    public static void main(String[] args) {


        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero");

        int numeroDecimal = Integer.parseInt(numeroStr);

        System.out.println("Numero decimal = " + numeroDecimal);

        System.out.println("Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100;

        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numero octal de  " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal));


        System.out.println("numero hexadecimal de  " + numeroBinario + " = " + Integer.toHexString(numeroDecimal));


    }
}
