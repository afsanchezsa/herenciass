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
public class Soft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Consultor consultor=new Consultor("poo",1);
   Administrador admin=new Administrador("Valeria",220,2);
   Programador programador=new Programador("isabel",500,3,"java");
    Programador programador2=new Programador("fabian",600,4,"c");
   LiderProyecto lider=new LiderProyecto("hernan",600,5,"java");
   lider.addProgramador(programador);
   lider.addProgramador(programador2);
   CompaniaSoftware compania=new CompaniaSoftware("unal");
   compania.addContrato(consultor);
   compania.addContrato(admin);
   compania.addContrato(programador);
   compania.addContrato(programador2);
   compania.addContrato(lider);
          String datosCompania=compania.ListarInformacion();
          System.out.println(datosCompania);
          double valorNomina=compania.CalcularNomina();
          System.out.println("Valor Nomina"+valorNomina);
          //Reporte Nomina
          ArrayList<Contrato>contratos=compania.reportarNomina();
          for(Contrato contrato:contratos){
          if(contrato instanceof Consultor){
          Consultor _consultor=(Consultor)contrato;
              System.out.println("Consultor"+_consultor.getLabor());
              
          }else if(contrato instanceof Administrador){
          Administrador administrador=(Administrador)contrato;
              System.out.println("Administrador"+administrador.getNombre()+administrador.toString());
          
          }else if(contrato instanceof Programador){
          Programador program=(Programador)contrato;
          
              System.out.println("Programador"+program.getNombre()+program.toString());
          }else if(contrato instanceof LiderProyecto){
          LiderProyecto l=(LiderProyecto)contrato;
              System.out.println("Lider"+l.getNombre()+l.toString());
          
          }
          
          }
    
    
    }
    
}
