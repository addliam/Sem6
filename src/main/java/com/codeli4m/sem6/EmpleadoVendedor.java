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
public class EmpleadoVendedor extends Empleado {
    private double montoVendido;
    private double tasaComision;

    public EmpleadoVendedor(String nDni, String nNombres, String nApellidos, double nMontoVendido, double nTasaComision) {
        super(nDni, nNombres, nApellidos);
        this.montoVendido = nMontoVendido;
        this.tasaComision = nTasaComision;
    }
    
    public double ingresos(){
        return this.montoVendido * this.tasaComision;
    }
    
    public double bonificaciones(){
        if (this.montoVendido < 1000){
            return 0;
        }else if (this.montoVendido < 5000){
            return ingresos()*0.05;
        }else{
            return ingresos()*0.10;
        }
    }
    
    public double descuentos(){
        if (ingresos() < 1000){
            return ingresos() * 0.11;
        }else{
            return ingresos() * 0.15;
        }
    }
    
    public double sueldo(){
        return ingresos() + bonificaciones() - descuentos();
    }
        
    @Override
    public String getInfo(){
        DecimalFormat df = new DecimalFormat("###0.00");
        String info = "";
        info += "EMPLEADO VENDEDOR: \n";
        info += super.getInfo()+"\n";
        info += "Ingresos: "+df.format(this.ingresos())+"\n";
        info += "Bonificaciones: "+df.format(this.bonificaciones())+"\n";
        info += "Descuentos: "+df.format(this.descuentos())+"\n";
        info += "Sueldo neto: "+df.format(this.sueldo())+"\n";
        return info;
    }
    
}
