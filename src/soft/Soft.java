/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
  Programador programador=null;
  Programador programador2=null;
  Programador programador3=null;
     CompaniaSoftware compania=new CompaniaSoftware("unal");
     
     
     try{
     programador3=new Programador("fab",600,4,"c");
     }catch(IllegalArgumentException e){
         System.out.println(e.getMessage());
     }  catch (Exceptiongo ex) {
          System.out.println(ex.getMessage());
        }
     
     
     
     
     
   try{
   programador=new Programador("isabel",500,3,"go");
    
     compania.addContrato(programador);
   }catch(Exceptiongo e){
       System.out.println(e.getMessage());;
    
    }
   try{
      
      programador2=new Programador("fabian",600,4,"c");
    
    compania.addContrato(programador2);
   }catch(Exceptiongo e){
   
       System.out.println(e.getMessage());;
   }
    try{
    LiderProyecto lider=new LiderProyecto("hernan",600,5,"java");
   if(programador2!=null){
     lider.addProgramador(programador2);
   }
  if(programador!=null){
  lider.addProgramador(programador);
  }
     
      compania.addContrato(lider);
    }catch(Exceptiongo e){
        System.out.println(e.getMessage());
    
    }
 
   
  
   compania.addContrato(consultor);
   compania.addContrato(admin);
   
   
  
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
