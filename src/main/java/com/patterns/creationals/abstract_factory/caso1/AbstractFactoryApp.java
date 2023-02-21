package com.patterns.creationals.abstract_factory.caso1;

/**
 * Este ejemplo renderiza un componente con un saludo, el cual se irá armando de acuerdo al sistema operativo de la pc.
 */
public class AbstractFactoryApp {

    GUIFactory factory;
    Button button;

    public AbstractFactoryApp() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            this.factory = new WinFactory();
        } else {
            this.factory = new MacFactory();
        }
    }

    public static void main(String...args){

        AbstractFactoryApp app = new AbstractFactoryApp();
        app.generarUI();
    }

    public void generarUI(){
        button = factory.createButton();
        button.paint();
    }

}
