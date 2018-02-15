package br.com.ks.springcrud.bootstrap;

import br.com.ks.springcrud.repository.ClientRepository;
import br.com.ks.springcrud.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private ClientRepository clientRepository;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        Client client = new Client("Cassiano");
        clientRepository.save(client);

       Client client2 = new Client("Ricardo");
       clientRepository.save(client2);



    }
}
