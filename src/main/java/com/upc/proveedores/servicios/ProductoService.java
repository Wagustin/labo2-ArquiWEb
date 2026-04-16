package com.upc.proveedores.servicios;

import com.upc.proveedores.dtos.ProductoTipoDTO;
import com.upc.proveedores.dtos.TipoProductoResumenDTO;
import com.upc.proveedores.repositorios.ProductoRepositorio;
import com.upc.proveedores.repositorios.ProveedorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepositorio productoRepositorio;

    public List<TipoProductoResumenDTO> listarSumaPreciosPorTipo() {
        return productoRepositorio.listarSumaPreciosPortipo();
    }

    public List<ProductoTipoDTO> listarDescripcionProductoyTipo() {
        return productoRepositorio.listarDescripcionProductoyTipo();
    }

}
