/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeli4m.sem6;

import java.text.DecimalFormat;

/**
 *
 * @author HP
 */
public class EmpleadoPermanente extends Empleado {
    private double sueldoBase;
    private String afiliacion;
    
    public EmpleadoPermanente(String nDni, String nNombres, String nApellidos, double nSueldoBase, String nAfiliacion) {
        super(nDni, nNombres, nApellidos);
        this.sueldoBase = nSueldoBase;
        this.afiliacion = nAfiliacion;
    }
    
    public double ingresos(){
        return sueldoBase;
    }
    
    public double descuentos(){
        if (this.afiliacion.equalsIgnoreCase("AFP")){
            return sueldoBase * 0.15;
        }else {
            return sueldoBase * 0.11;
        }
    }
    
    public double sueldo(){
        return ingresos() -  descuentos();
    }
    
    @Override
    public String getInfo(){
        DecimalFormat df = new DecimalFormat("###0.00");
        String info = "";
        info += "EMPLEADO PERMANENTE\n";
        info += super.getInfo()+"\n";
        info += "Ingresos: "+df.format(ingresos())+"\n";
        info += "Descuentos: "+df.format(descuentos())+"\n";
        info += "Sueldo Neto: "+df.format(sueldo())+"\n";
        return info;
    }
    
}
