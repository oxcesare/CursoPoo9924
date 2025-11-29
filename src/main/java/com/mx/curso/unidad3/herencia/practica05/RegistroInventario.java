package com.mx.curso.unidad3.herencia.practica05;

public class RegistroInventario {

    private String nombreEncargado;

    public RegistroInventario(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    public void registrarMovimiento(Articulo articulo, int cantidad) {
        System.out.println("Registro Entrada " + cantidad);
        articulo.setCantidadStock(cantidad);

    }

    public void registrarMovimiento(Articulo articulo, int cantidad, String prioridad) {
        System.out.println("Registro Salida " + cantidad + " Prioridad: " + prioridad);
        articulo.setCantidadStock(cantidad);
    }

    private void registrarLogistica(String codigoProducto, int movimientos) {
        System.out.println("Registrando Logistica para el producto: "
                + codigoProducto + " con " + movimientos + " movimientos");
    }

    public static void main(String[] args) {
        Articulo tornillo = new Articulo("T123");
        RegistroInventario registro = new RegistroInventario("Cesar");
        registro.registrarMovimiento(tornillo, 100);
        registro.registrarMovimiento(tornillo, 10, "Normal");
        System.out.println("Cantidad en Stock: " + tornillo.getCantidadStock());
        registro.registrarLogistica(tornillo.getCodigo(), 2);

    }
}
