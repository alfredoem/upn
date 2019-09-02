/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaIMC;

/**
 *
 * @author alfredo
 */
public class PersonaIMC {
    
    private final static char SEXO_DEF = 'M';
    
    public static final int INFRAPESO = -1;
    
    public static final int PESO_IDEAL = 0;
    
    public static final int SOBREPESO = 1;
    
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;
    
    public PersonaIMC() {
        this("", 0, SEXO_DEF, 0, 0);
    }

    public PersonaIMC(String nombre, int edad, char sexo) {
        this(nombre, edad,  sexo, 0, 0);
    }

    public PersonaIMC(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        generarDni();
        comprobarSexo();
    }
    
    private void comprobarSexo() {
        if (sexo != 'M' && sexo != 'F') {
            this.sexo = SEXO_DEF;
        }
    }
    
    private void generarDni() {
        
    }
    
    
    
    
    
    
    
}
