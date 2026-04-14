package com.upc.proveedores.servicios;

import com.upc.proveedores.ProveedoresApplication;
import com.upc.proveedores.dtos.ProveedorDTO;
import com.upc.proveedores.entidades.Proveedor;
import com.upc.proveedores.repositorios.ProveedorRepositorio;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService {
    @Autowired
    private ProveedorRepositorio proveedorRepositorio;
    @Autowired
    private ModelMapper modelMapper;

    @Transactional()
    public ProveedorDTO insertar(ProveedorDTO proveedorDTO){
        //convertir DTO a Entidad
        Proveedor proveedor = modelMapper.map(proveedorDTO, Proveedor.class);
        proveedor = proveedorRepositorio.save(proveedor);
        return modelMapper.map(proveedor, ProveedorDTO.class);
    }

    public List<ProveedorDTO> listarProveedores(){

        return proveedorRepositorio.findAll().stream()
                .map(proveedor -> modelMapper.map(proveedor, ProveedorDTO.class)).toList();
    }

    public void eliminar(Long id){
        if (proveedorRepositorio.existsById(id)) {
            proveedorRepositorio.deleteById(id);
        }
    }

    public ProveedorDTO buscarPorId(Long id)
    {
        return modelMapper.map(proveedorRepositorio.findById(id).get(), ProveedorDTO.class);
    }
}
