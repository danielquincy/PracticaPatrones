package com.patterns.creationals.abstract_factory.caso1;

public class WinFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WinButton();
    }
}
