package org.educa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "alquiler")
public class AlquilerEntity implements Serializable {
    @Serial
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_alquiler")
    private Integer id;
    @Column(name = "fecha_ini")
    private LocalDate fechaIni;
    @Column(name = "fecha_fin")
    private LocalDate fechaFin;
    private BigDecimal precio;
    @Column(name = "id_cliente")
    private ClienteEntity cliente;
    @Column(name = "id_vehiculo")
    private VehiculoEntity vehiculo;
    @Column(name = "id_seguro")
    private SeguroEntity seguro;

}