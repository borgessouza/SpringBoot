package br.com.ks.springcrud.controllers;

import br.com.ks.springcrud.VO.ClientVO;
import br.com.ks.springcrud.model.Client;
import br.com.ks.springcrud.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    public ClientVO addClient() {
        return null;
    }

    @RequestMapping("/list")
    public String listClient(Model model) {

        Iterable<Client> listClients = clientRepository.findAll();
        listClients.forEach(System.out::println);
        model.addAttribute("name", "Mundo");

        return "listClients";
    }


}
