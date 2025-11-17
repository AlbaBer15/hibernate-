package org.educa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "sucursal")
public class SucursalEntity implements Serializable {
    @Serial
    private static final long SerialVersionUID=1L;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sucursal")
    private Integer id;
    private String calle;
    private String ciudad;
    private String pais;
    @Column(name = "c_p")
    private String cp;
    private List<VehiculoEntity> vehiculos;

}