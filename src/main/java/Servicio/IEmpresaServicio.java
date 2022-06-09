/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.List;
import Modelo.Empresa;

/**
 *
 * @author NOTEBOOK
 */
public  interface IEmpresaServicio {
    
   public Empresa crearEmpresa(Empresa empresa);
    public List<Empresa> listarEmpresas();
    public Empresa getEmpresaByCode(int codigo);
    
}
