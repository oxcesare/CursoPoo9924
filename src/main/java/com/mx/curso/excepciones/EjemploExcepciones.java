package com.mx.curso.excepciones;

public class EjemploExcepciones {

    // 1. Definición de Excepción Personalizada (Checked Exception)
    static class SalarioInvalidoException extends Exception {
        public SalarioInvalidoException(String mensaje) {
            super(mensaje);
        }
    }

    /**
     * Método que realiza una operación crítica y lanza la excepción personalizada.
     */
    public static void calcularBono(double salarioBase) throws SalarioInvalidoException {

        System.out.println("Intentando calcular bono...");

        // Lógica de validación
        if (salarioBase < 0) {
            // Lanzamos nuestra excepción chequeada si el salario es negativo
            throw new SalarioInvalidoException("El salario base no puede ser negativo: " + salarioBase);
        }

        // Simulación de una operación de lógica que podría fallar
        int totalEmpleados = 0;

        try {
            // 2. Simulación de ArithmeticException (Unchecked Exception)
            double bonoPorEmpleado = 100000 / totalEmpleados;
            System.out.println("Bono calculado: " + bonoPorEmpleado);

        } catch (ArithmeticException e) {
            // Capturamos el error de división por cero
            System.err.println("[ERROR LÓGICA] Fallo al distribuir el bono (División por cero).");
            // Podemos relanzar una excepción de tipo checked si queremos forzar el manejo
            throw new RuntimeException("Error interno de cálculo.", e);
        }

        System.out.println("Bono calculado con éxito.");
    }

    public static void main(String[] args) {

        // Caso 1: Salario Negativo (Maneja SalarioInvalidoException)
        try {
            calcularBono(-500.00);
        } catch (SalarioInvalidoException e) {
            System.err.println("\n[CAPTURA 1 - Salario Inválido]");
            System.err.println("Mensaje: " + e.getMessage());
        } catch (RuntimeException e) {
            System.err.println("\n[CAPTURA 1 - Error de Ejecución]");
            System.err.println("Error relanzado: " + e.getMessage());
        }

        System.out.println("-------------------------------------");

        // Caso 2: Salario Válido, pero error de lógica interna (Maneja RuntimeException)
        try {
            calcularBono(50000.00);
        } catch (SalarioInvalidoException e) {
            // Este bloque no se ejecutará para el caso 2
        } catch (RuntimeException e) {
            System.err.println("\n[CAPTURA 2 - Error de Ejecución]");
            System.err.println("Error: " + e.getMessage());
        } finally {
            // 3. Bloque finally: Siempre se ejecuta, haya habido excepción o no.
            System.out.println("[FINALLY] Proceso de cálculo terminado.");
        }
    }
}