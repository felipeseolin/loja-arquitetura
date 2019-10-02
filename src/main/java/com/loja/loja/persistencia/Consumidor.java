package com.loja.loja.persistencia;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EntityScan
@Builder
public class Consumidor implements Serializable{
    
    @Id @GeneratedValue
    private Long id;
    private String nome;
    private String telefone;
}
