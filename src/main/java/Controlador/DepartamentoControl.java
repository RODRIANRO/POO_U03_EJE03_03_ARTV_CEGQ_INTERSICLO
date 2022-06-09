/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
        
 import java.util.List;
import Modelo.Departamento;
import Modelo.Empleado;
import Modelo.Empresa;
import Servicio.DepartamentoServicio;

/**
 *
 * @author NOTEBOOK
 */
public class DepartamentoControl {
     private final DepartamentoServicio departamentoServicio = new DepartamentoServicio();
    
    public Departamento crearDepartamento(int codigo, String nombre, Empresa empresa, String ubicacion){
        return departamentoServicio.crearDepartamento(new Departamento(codigo, nombre, empresa, ubicacion));
    }
    
    public List<Departamento> listarDepartamentos(){
        return departamentoServicio.listarDepartementos();
    }
    
    public Departamento getDepartamentoByCode(int code){
        return departamentoServicio.getDepartamentoByCode(code);
    }
    
    public void asignarGerenteDepartemento(int codigo, Empleado empleado){
        departamentoServicio.asignarGerente(codigo, empleado);
        
    }
}

