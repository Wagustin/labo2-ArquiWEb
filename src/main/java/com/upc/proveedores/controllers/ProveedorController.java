package com.upc.proveedores.controllers;

import com.upc.proveedores.dtos.ProveedorDTO;
import com.upc.proveedores.entidades.Proveedor;
import com.upc.proveedores.repositorios.ProveedorRepositorio;
import com.upc.proveedores.servicios.ProveedorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api")
public class ProveedorController {
    @Autowired
    private ProveedorService proveedorService;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ProveedorRepositorio proveedorRepositorio;

    @PostMapping("/proveedor")
    public ProveedorDTO insertar(@RequestBody ProveedorDTO proveedorDTO){
        return proveedorService.insertar(proveedorDTO);
    }
    @GetMapping("/proveedores") //ednpoint
    public List<ProveedorDTO> listarProveedores(){

        return proveedorService.listarProveedores();
    }

    @DeleteMapping("/proveedor/{id}")
    public void eliminar(@PathVariable Long id)
    {

        proveedorService.eliminar(id);
    }
    public ProveedorDTO buscarPorId(Long id)
    {
        return modelMapper.map(proveedorRepositorio.findById(id), ProveedorDTO.class);
    }

    @GetMapping("/proveedor/{id}")
    
}
