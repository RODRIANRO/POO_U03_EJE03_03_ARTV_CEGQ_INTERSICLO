/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Departamento;
import java.util.List;

/**
 *
 * @author NOTEBOOK
 */
public interface IDepartamentoServicio {
    public Departamento crearDepartamento(Departamento departamento);
    public List<Departamento> listarDepartementos();
    public Departamento getDepartamentoByCode(int codigo);
}

