package com.upc.proveedores.repositorios;

import com.upc.proveedores.entidades.TipoProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoProductoRepositorio extends JpaRepository<TipoProducto, Long> {
    //listar nombre y tipo de producto



}
