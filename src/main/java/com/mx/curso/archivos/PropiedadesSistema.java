package com.mx.curso.archivos;

import com.mx.curso.unidad2.excepciones.UsoScanner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropiedadesSistema {

    public static void main(String[] args) {

        try {

            FileInputStream sc = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(sc);
            p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto");
            System.setProperties(p);
            System.getProperties().list(System.out);

        } catch (Exception ex) {
            System.out.println("No existe el archivo = " + ex);
        }


    }
}
