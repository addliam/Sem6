/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeli4m.sem6;

/**
 *
 * @author HP
 */
public class Empleado {
    private String dni;
    private String nombres;
    private String apellidos;

    public Empleado(String dni, String nombres, String apellidos) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    public String getInfo(){
        String info = "";
        info += "DNI: "+this.dni+"\n";
        info += "NOMBRES: "+this.nombres+"\n";
        info += "APELLIDOS: "+this.apellidos;
        return info;
    }
    
}
