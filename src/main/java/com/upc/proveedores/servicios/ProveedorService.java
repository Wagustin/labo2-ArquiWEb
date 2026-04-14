package com.upc.proveedores.servicios;

import com.upc.proveedores.dtos.ProveedorDTO;
import com.upc.proveedores.entidades.Proveedor;
import com.upc.proveedores.repositorios.ProveedorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService {
    @Autowired
    private ProveedorRepositorio proveedorRepositorio;

    public Proveedor insertar(ProveedorDTO proveedorDTO){
        //convertir DTO a Entidad
        return proveedorRepositorio.save(proveedor);
    }

    public List<Proveedor> listarProveedores(){

        return proveedorRepositorio.findAll();
    }

    public void eliminar(Long id){
        if (proveedorRepositorio.existsById(id)) {
            proveedorRepositorio.deleteById(id);
        }
    }

}
