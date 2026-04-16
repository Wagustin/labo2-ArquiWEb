package com.upc.proveedores.controllers;


import com.upc.proveedores.dtos.ProductoTipoDTO;
import com.upc.proveedores.dtos.TipoProductoResumenDTO;
import com.upc.proveedores.servicios.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductoController {
    @Autowired
    private ProductoService productoService;
    @GetMapping("/reporte1")
    List<TipoProductoResumenDTO> listarSumaPreciosPortipo(){
        return  productoService.listarSumaPreciosPorTipo();
    }
    @GetMapping("/reporte2")
    public List<ProductoTipoDTO> listarDescripcionProductoyTipo(){
        return productoService.listarDescripcionProductoyTipo();
    }
}
