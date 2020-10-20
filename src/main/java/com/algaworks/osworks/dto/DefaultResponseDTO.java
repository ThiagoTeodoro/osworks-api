package com.algaworks.osworks.dto;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * Modelo de reposta padrão da API.
 *
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 * @param <T>
 */
@Getter
public class DefaultResponseDTO<T> {

    private DefaultResponseHeaderDTO header;
    private T body;

    /**
     * Construtor para resposta OK 200.
     *
     * @param body
     */
    public DefaultResponseDTO(T body) {

        this.header = DefaultResponseHeaderDTO.builder()
                .status(HttpStatus.OK.value())
                .message(HttpStatus.OK.getReasonPhrase())
                .build();

        this.body = body;
    }

    /**
     * Construtor para personalização de resposta.
     *
     * @param status
     * @param msg
     * @param body
     */
    public DefaultResponseDTO(int status, String msg, T body) {

        this.header = DefaultResponseHeaderDTO.builder()
                .status(status)
                .message(msg)
                .build();

        this.body = body;
    }
}
