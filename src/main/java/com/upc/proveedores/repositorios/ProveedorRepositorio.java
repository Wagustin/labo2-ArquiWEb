package com.upc.proveedores.repositorios;

import com.upc.proveedores.entidades.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedorRepositorio extends JpaRepository<Proveedor, Long > {
}
