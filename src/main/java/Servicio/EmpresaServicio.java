/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.ArrayList;
import java.util.List;
import Modelo.Empresa;

/**
 *
 * @author NOTEBOOK
 */
public class EmpresaServicio implements IEmpresaServicio{
    
    private final List<Empresa> listaEmpresas = new ArrayList<>();

    @Override
    public Empresa crearEmpresa(Empresa empresa) {
        listaEmpresas.add(empresa);
        return empresa;
    }

    @Override
    public List<Empresa> listarEmpresas() {
        return listaEmpresas;
    }

    @Override
    public Empresa getEmpresaByCode(int codigo) {
        for (Empresa emp: listaEmpresas){
            if (emp.getCodigo() == codigo){
                return emp;
            }
        }
        return null;
    }
    
}