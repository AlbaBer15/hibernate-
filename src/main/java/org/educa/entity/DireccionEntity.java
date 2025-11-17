package org.educa.entity;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "direccion")
public class DireccionEntity implements Serializable {
    @Serial
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_direccion")
    private Integer id;
    private String calle;
    private String ciudad;
    private String pais;
    @Column(name = "c_p")
    private String cp;
    @Column(name = "id_cliente")
    private ClienteEntity cliente;

}