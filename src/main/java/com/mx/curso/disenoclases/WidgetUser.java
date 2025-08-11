package com.mx.curso.disenoclases;


abstract class Widget {

    String data = "widget";

    public void doWidgetStuff() {
        System.out.println("Invocacion al metodo de la clase abstracta");
    }
}

class C extends Widget {
    String c = "c";

    public void doWidgetStuff() {
        System.out.println(c);
    }

}

class GoodWidget extends Widget {
    String data = "big data";

    public void doWidgetStuff() {
        System.out.println(data);
    }
}


public class WidgetUser {
    public static void main(String[] args) {

        Widget w = new GoodWidget();

        /**
         * El polimorfismo que en este escenario es de subtipos
         * solo aplica a la invocacion de metodos de instancia
         */
        w.doWidgetStuff();
        /**
         * El acceso a datos  se resuelve en tiempo de compilacion
         */
        System.out.println(w.data);


        /**
         *
         */
        Widget c = new C();
        c.doWidgetStuff();
    }
}
