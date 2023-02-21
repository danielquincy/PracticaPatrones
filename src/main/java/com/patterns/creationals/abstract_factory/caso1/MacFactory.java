package com.patterns.creationals.abstract_factory.caso1;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

}
