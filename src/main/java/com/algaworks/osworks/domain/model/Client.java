package com.algaworks.osworks.domain.model;


import lombok.Data;

/**
 * Modelo de Dados para Cliente
 *
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
@Data
public class Client {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
}
