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
public abstract class Contrato {
    protected int Id;

    public Contrato(int Id) {
        this.Id = Id;
    }
    public abstract double calcularSalario();

    public int getId() {
        return Id;
    }

    @Override
    public String toString() {
        return "Contrato{" + "Id=" + Id + '}';
    }
    
}
