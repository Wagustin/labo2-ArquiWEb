package com.upc.proveedores.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProveedorDTO {
    private Long idProveedor;
    private LocalDate fechaInscripcion;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
}
