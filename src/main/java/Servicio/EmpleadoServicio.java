/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.ArrayList;
import java.util.List;
import Modelo.Departamento;
import Modelo.Empleado;

/**
 *
 * @author NOTEBOOK
 */
public class EmpleadoServicio implements IEmpleadoServicio{
     private final List<Empleado> listaEmpleados = new ArrayList<>();

    @Override
    public Empleado crearEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
        return empleado;
    }

    @Override
    public List<Empleado> listarEmpleados() {
        return listaEmpleados;
    }

    @Override
    public Empleado getEmpleadoByCedula(String cedula) {
        for (Empleado emp : listaEmpleados) {
            if(emp.getCedula().equals(cedula)){
                return emp;
            }
        }
        return null;
    }
    
    public void asignarDepartamento(String cedula, Departamento departamento){
        getEmpleadoByCedula(cedula).asignarDepartamento(departamento);
    }
    
    
}

    

