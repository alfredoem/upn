/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaIMC;

import javax.swing.JOptionPane;

/**
 *
 * @author alfredo
 */
public class PersonaAPP {
    
    public static void main(String[] args) {
        /*String nombre = JOptionPane.showInputDialog("Introduce el nombre");
        
        String texto = JOptionPane.showInputDialog("Introduce la edad");
        int edad = Integer.parseInt(texto);
        
        texto = JOptionPane.showInputDialog("Introduce el sexo");
        char sexo = texto.charAt(0);
        
        texto = JOptionPane.showInputDialog("Introduce el peso");
        double peso = Double.parseDouble(texto);
        
        texto = JOptionPane.showInputDialog("Introduce la altura");
        double altura = Double.parseDouble(texto);*/
        
        PersonaIMC persona1 = new PersonaIMC();
 
        
       /* PersonaIMC persona2 = new PersonaIMC(nombre, edad, sexo);
        PersonaIMC persona3 = new PersonaIMC(nombre, edad, sexo, peso, altura);
        
        persona1.setNombre("Luisa");
        persona1.setEdad(28);
        persona1.setSexo('F');
        persona1.setPeso(60);
        persona1.setAltura(1.8);
        
        persona2.setPeso(80.5);
        persona2.setAltura(1.75);
        
        System.out.println("Persona 1");
        muestraMensajePeso(persona1);
        muestraMayorDeEdad(persona1);
        System.out.println(persona1.toString());
        
        System.out.println("Persona 2");
        muestraMensajePeso(persona2);
        muestraMayorDeEdad(persona2);
        System.out.println(persona2.toString());
        
        System.out.println("Persona 3");
        muestraMensajePeso(persona3);
        muestraMayorDeEdad(persona3);
        System.out.println(persona3.toString());*/
    }
        
    public static void muestraMensajePeso(PersonaIMC p) {
        int IMC = p.calcularIMC();

        switch  (IMC) {
            case PersonaIMC.PESO_IDEAL:
                System.out.println("La persona esta en su peso ideal");
                break;
            case PersonaIMC.INFRAPESO:
                System.out.println("La persona esta debajo de su peso ideal");
                break;
            case PersonaIMC.SOBREPESO:
                System.out.println("La persona esta por encima de su peso ideal");
                break;
        }
    }


    public static void muestraMayorDeEdad(PersonaIMC p) {
        if (p.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }
    
}
