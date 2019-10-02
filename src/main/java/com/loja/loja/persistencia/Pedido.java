package com.loja.loja.persistencia;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.ManyToOne;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EntityScan
@Builder
public class Pedido implements Serializable {

    @Id @GeneratedValue
    private Long id;
    private double total;
    
    @ManyToOne
    private Consumidor consumidor;
}
