package com.patterns.creationals.builder.caso3;
/**
 * Este ejemplo crea una TODO LIST utilizando el patrón Builder
 */

import java.util.Date;

public class BuilderApp {

    public static void main(String[] args) {
        Task task = new TaskBuilder(5l)
                .setDescription("Hacer ejercicio")
                .setSummary("Test")
                .setDueDate(new Date())
                .build();
        System.out.println(task);
    }
}
