package com.upc.proveedores.controllers;

import com.upc.proveedores.dtos.ProveedorDTO;
import com.upc.proveedores.entidades.Proveedor;
import com.upc.proveedores.servicios.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProveedorController {
    @Autowired
    private ProveedorService proveedorService;

    @PostMapping("/proveedor")
    public ProveedorDTO insertar(@RequestBody ProveedorDTO proveedorDTO){
        return proveedorService.insertar(proveedorDTO);
    }
    @GetMapping("/proveedores") //ednpoint
    public List<Proveedor> listarProveedores(){

        return proveedorService.listarProveedores();
    }

    @DeleteMapping("/proveedor/{id}")
    public void eliminar(@PathVariable Long id)
    {

        proveedorService.eliminar(id);
    }
}
