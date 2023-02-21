package com.patterns.creationals.prototype.caso3;

public interface PrototypeCapable extends Cloneable{
    PrototypeCapable clone() throws CloneNotSupportedException;
}