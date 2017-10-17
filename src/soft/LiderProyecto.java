/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class LiderProyecto extends Programador{
private ArrayList<Programador>programadores;

    public LiderProyecto(String nombre, double salario, int id, String lenguaje)throws Exceptiongo {
        super(nombre, salario, id, lenguaje);
        this.programadores=new ArrayList<>();
    }
@Override
    public double calcularSalario(){
    return this.salario+(this.salario*0.1*this.programadores.size());
    
    
    }
public boolean  addProgramador(Programador programador){
if(this.programadores.add(programador))
return true;
else return false;

}

    @Override
    public String toString() {
      //  return "LiderProyecto{" + "programadores=" + programadores + '}';
    
    String aux="";
    aux+=super.toString()+" a cargo de ";//es super pues se refiere a la superclase programador(pues para listar su propia informacuon el se ve como un programador
    for(Programador programador:programadores){
    aux+=programador.toString();
    
    }
       return aux;     
            }

}
