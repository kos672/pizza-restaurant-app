package root.business.client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import root.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

    Client getClientByName(String name);

}
