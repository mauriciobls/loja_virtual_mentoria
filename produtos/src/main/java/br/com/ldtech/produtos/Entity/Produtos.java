package br.com.ldtech.produtos.Entity;

import lombok.Data;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Produtos {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private BigDecimal preco;

    @Column
    private String descricao;

}
