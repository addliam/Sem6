/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.codeli4m.sem6;

/**
 *
 * @author HP
 */
public class Sem6 {

    public static void main(String[] args) {
        System.out.println("Iniciando interfaz principal!");
        // creamos una instancia del formulario
        MainForm formulario = new MainForm();
        // lo ponemos visible
        formulario.setVisible(true);
        // lo centramos en medio de la pantalla
        formulario.setLocationRelativeTo(null);
    }
}
