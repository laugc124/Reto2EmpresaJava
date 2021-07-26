/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;
import ClsEmpresas.*;

/**
 *
 * @author agos1
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
    
    
    cliente cliente1 = new cliente(" juan", "salazara", "1091", "jsalazar@gmail.com", "cra 4 b 43", "310876");
    administrativo contabilidad = new administrativo("contador", 3500000, 3, 4, "Esteban", " jaramillo", "345678", "contabilidad@gmail.com");
    administrativo asistente = new administrativo("asistente administrativo", 2000000, 2, 0, "Daniel", " Cardenas", "1098765", "daniel.cardenas@gmail.com");
    operativo operador = new operativo("operador cargador", 1500000, 1, "Oscar", " Velez", "34567", "oscar@gmail.com");
    company constructora = new company("constructora S.A", "90034569", "cra 56 # 45 bogota", operador);
       
    
    
    cliente1.comprando();
    cliente1.cotizando();
    contabilidad.PagarNomina();
    asistente.RealizarInforme();
    operador.operarMaquinaria();
    System.out.println("empresa: "+ constructora.getRazonSocial()+ " NIT: "+ constructora.getNIT());
    }
    
            
    }
