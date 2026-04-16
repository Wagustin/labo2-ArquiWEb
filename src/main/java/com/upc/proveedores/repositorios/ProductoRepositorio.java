package com.upc.proveedores.repositorios;

import com.upc.proveedores.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepositorio extends JpaRepository <Producto, Long> {

}
