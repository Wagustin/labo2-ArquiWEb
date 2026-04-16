package com.upc.proveedores.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ProductoTipoDTO {
    private String descripcion; //del producto
    private String nombreTipo;

}
