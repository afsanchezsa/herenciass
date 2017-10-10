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
public class Administrador extends Empleado {

    public Administrador(String nombre, double salario, int id) {
        super(nombre, salario, id);
    }

    @Override
    public double calcularSalario() {
       return this.salario;
    }

    @Override
    public String toString() {
        return "Administrador{" + '}';
    }

    
    
    
}
