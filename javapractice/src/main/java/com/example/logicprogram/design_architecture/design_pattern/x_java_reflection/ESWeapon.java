package com.example.logicprogram.design_architecture.design_pattern.x_java_reflection;

// Any part that implements the interface ESWeapon
// can replace that part in any ship

public interface ESWeapon{

    // User is forced to implement this method
    // It outputs the string returned when the
    // object is printed

    public String toString();

}