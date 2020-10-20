package com.algaworks.osworks.controller;

import com.algaworks.osworks.domain.model.Client;
import com.algaworks.osworks.dto.DefaultResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * Implementação do Controller de Clientes
 *
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
@RestController
@RequestMapping("/v1")
public class ClientControllerImpl implements ClientController {

    /**
     * Endpoit responsável por listar todos os Clientes.
     *
     * @return
     */
    @GetMapping("/clients")
    @Override
    public ResponseEntity<DefaultResponseDTO<List<Client>>> list(ModelMap modelMap) {

        Client client1 = new Client();
        client1.setId(new Long(1));
        client1.setNome("João");
        client1.setTelefone("3211-1232");

        Client client2 = new Client();
        client2.setId(new Long(1));
        client2.setEmail("maria@json.com.br");
        client2.setNome("Maria");
        client2.setTelefone("3211-9751");

        return new ResponseEntity<>(new DefaultResponseDTO<List<Client>>(Arrays.asList(client1, client2)), HttpStatus.OK);
    }

}
