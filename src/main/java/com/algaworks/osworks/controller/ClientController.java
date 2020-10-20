package com.algaworks.osworks.controller;

import com.algaworks.osworks.domain.model.Client;
import com.algaworks.osworks.dto.DefaultResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Interface para a implementação do controller para Clients.
 *
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
public interface ClientController {

    /**
     * Endpoit responsável por listar todos os Clientes.
     *
     * @return
     */
    public ResponseEntity<DefaultResponseDTO<List<Client>>> list(ModelMap modelMap);

}
