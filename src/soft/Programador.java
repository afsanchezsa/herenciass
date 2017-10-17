/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft;

/**
 *
 * @author Estudiante
 */
public class Programador extends Empleado{
private String Lenguaje;
    public Programador(String nombre, double salario, int id,String lenguaje)throws Exceptiongo {
        super(nombre, salario, id);
        if(lenguaje.equalsIgnoreCase("go")){
        throw new Exceptiongo("no puede ser go el lenguaje de programacion");
        
        }else{
        this.Lenguaje=lenguaje;
        }
    
    }

    @Override
    public double calcularSalario() {
        if(this.Lenguaje.equals("java")){
        return(this.salario+(this.salario*0.1));
        
        
        }else{
        return this.salario;
        
        }
    }

    @Override
    public String toString() {
        return "Programador{" + "Lenguaje=" + Lenguaje + '}';
    }
    
    
}
