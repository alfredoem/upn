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
        final int divisor = 23;
        
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);
        
        char letraDNI = generaLetraDNI(res);
        
        DNI = Integer.toString(numDNI) + letraDNI;
        
    }
    
    private char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };
        
        return letras[res];
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    public int calcularIMC() {
        double pesoActual = peso / (Math.pow(altura, 2));
        
        if (pesoActual >= 20 && pesoActual <= 25) {
            return PESO_IDEAL;
        } else if (pesoActual < 20) {
            return INFRAPESO;
        } else {
            return SOBREPESO;
        }
    }
    
    
    public boolean esMayorDeEdad() {
        boolean mayor = false;
        
        if (edad >= 18) {
            mayor = true;
        }
        
        return mayor;
    }

    @Override
    public String toString() {
        String sexo;
        
        if (this.sexo == 'M') {
            sexo = "masculino";
        } else {
            sexo = "femenino";
        }
        
        return "Informaci[on de la persona: \n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " a\n"
                + "DNI: " + DNI + "\n"
                + "Peso: " + peso + "\n"
                + "Altura: " + altura + "\n";
    }
     
}
