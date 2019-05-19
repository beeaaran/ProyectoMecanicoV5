/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miPaquete;

import java.util.ArrayList;

/**
 *
 * @author jaime
 */
public class Controlador {
    private static ArrayList <servicioClase> serviciosArray = new ArrayList<>();
    
    public static boolean primeraVezQueAbroElPrograma = true;
    
    public static boolean registrarServicio(String idDeServicio, String nombreDelSevicio, double costo, String mecanicoAsignado, String obeservacionesCliente, String fechaLLegada, String fechaEntrega, String modelo, String marca, String color, String submarca, String placas, String kilometraje, String numeroDeSerie, String nombreCliente, String direccion, String telefono, String correo, String ultimaVisita, String observacionesMecanico){
    
        try{
             serviciosArray.add(new servicioClase(idDeServicio, nombreDelSevicio, costo, mecanicoAsignado, obeservacionesCliente, fechaLLegada, fechaEntrega, modelo, marca, color, submarca, placas, kilometraje, numeroDeSerie, nombreCliente, direccion, telefono, correo, ultimaVisita, observacionesMecanico));
             return  true;
             
        }catch(Exception e){
            return false;
        }
        
    }
    
    
    public static servicioClase buscarServicio(String codigoBuscado){
        for (servicioClase servicio : serviciosArray) { 
            if(servicio.getIdDeServicio() == codigoBuscado){
            
                return  servicio;
            }
        }
        
        //si no se encuentra el alumno buscado retornamos un 
        //objeto que el código sea -1
        servicioClase a = new servicioClase();
        
        
        return  a;
    
    }
    
    public static boolean verficarCodigo(String idDeServicio){
        for (servicioClase servicio : serviciosArray) {
            if(servicio.getIdDeServicio()== idDeServicio){
            
                System.out.println("Codigo Repetido Carnal");
                return true;
            }
        }
    
    return false;
            }
    
     public static ArrayList obtenerRegistros(){
        return serviciosArray;
    }

    
    
}
