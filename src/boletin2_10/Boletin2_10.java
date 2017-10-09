
package boletin2_10;

import java.util.Scanner;

public class Boletin2_10 {

    public static void main(String[] args) {

        float retencion=36,dPrecio=30,kmprecio=2, comision=0.05F, sueldoBase,dias,Km,totalVentas,irpf,sueldoBruto,Sueldo;
        
        Scanner entradateclado = new Scanner (System.in);
        
        System.out.println("Introduzca el sueldo base");
        
        sueldoBase= entradateclado.nextFloat();
        
        System.out.println("Introduzca los días");
        
        dias= entradateclado.nextFloat();
        
        System.out.println("Introduzca los Km recorridos");
        
        Km= entradateclado.nextFloat();
         
        System.out.println("Introduzca el total de ventas");
        
        totalVentas= entradateclado.nextFloat();
        
        System.out.println("Introduzca el IRPF ");
        
        irpf= entradateclado.nextFloat();
        
        sueldoBruto= sueldoBase + dPrecio*dias + kmprecio*Km + comision*totalVentas;
        Sueldo= (sueldoBruto - (sueldoBruto*irpf)-retencion);
        
        System.out.println("Su sueldo Neto es: " + Sueldo);
        
    }
    
}
