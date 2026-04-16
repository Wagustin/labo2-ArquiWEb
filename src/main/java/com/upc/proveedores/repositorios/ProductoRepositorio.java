package com.upc.proveedores.repositorios;

import com.upc.proveedores.dtos.ProductoTipoDTO;
import com.upc.proveedores.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepositorio extends JpaRepository <Producto, Long> {

    @Query("select new com.upc.proveedores.dtos.ProductoTipoDTO(p.descripcion, t.nombre)" +
            " from Producto p join p.tipoProducto t")
    List<ProductoTipoDTO> listarDescripcionProductoyTipo();

}
