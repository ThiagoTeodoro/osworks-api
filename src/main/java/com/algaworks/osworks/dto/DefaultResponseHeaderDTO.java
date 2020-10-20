package com.algaworks.osworks.dto;

import lombok.Builder;
import lombok.Getter;

/**
 * Header para o Modelo de reposta padrão da API.
 *
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
@Builder
@Getter
public class DefaultResponseHeaderDTO {

    private int status;
    private String message;
}
