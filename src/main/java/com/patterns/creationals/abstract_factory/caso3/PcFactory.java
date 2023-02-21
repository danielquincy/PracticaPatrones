package com.patterns.creationals.abstract_factory.caso3;

public class PcFactory implements AbstractFactory{

    private String ram;
    private String hdd;
    private String cpu;

    public PcFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Pc(this.ram, this.hdd, this.cpu);
    }
}
