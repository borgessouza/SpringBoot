package br.com.ks.springcrud.repository;

import br.com.ks.springcrud.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

}
