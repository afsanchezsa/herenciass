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
public class Consultor extends Contrato {
    private String Labor;

    public Consultor(String Labor,int id) {
        super(id);
        this.Labor = Labor;
    }

    @Override
    public double calcularSalario() {
        return (220);
    }

    public String getLabor() {
        return Labor;
    }

    public void setLabor(String Labor) {
        this.Labor = Labor;
    }

    @Override
    public String toString() {
        return "Consultor{" + "Labor=" + Labor + '}';
    }
    
}
