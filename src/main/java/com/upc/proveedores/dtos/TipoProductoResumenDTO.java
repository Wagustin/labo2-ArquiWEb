package com.upc.proveedores.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class TipoProductoResumenDTO {
    private String nombreTipo;
    private double suma; //suma de precios de productos

}
