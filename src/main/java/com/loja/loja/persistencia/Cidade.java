
package com.loja.loja.persistencia;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EntityScan
@Builder
public class Cidade implements Serializable {
   
    @Id @GenaretedValue
    private Long id;
    private String nome;
    
    @ManyToOne
    private Estado estado;
}
