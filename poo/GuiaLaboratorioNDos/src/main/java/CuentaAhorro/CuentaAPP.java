/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaAhorro;

/**
 *
 * @author alfredo
 */
public class CuentaAPP {
    
    public static void main(String[] args) {
        Cuenta cuenta_1 = new Cuenta("Pedro");
        Cuenta cuenta_2 = new Cuenta("Esteban", 60);
        
        cuenta_1.ingresar(500);
        cuenta_2.ingresar(400);
        
        cuenta_1.retirar(100);
        cuenta_2.retirar(400);
        
        System.out.println(cuenta_1);
        System.out.println(cuenta_2);
    }
    
}
