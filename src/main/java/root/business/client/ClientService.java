package root.business.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import root.business.address.AddressService;
import root.entities.Client;

import java.util.List;

@Service
public class ClientService {

    private ClientRepository repository;
    private ClientConverter converter;
    private AddressService addressService;

    @Autowired
    public ClientService(ClientRepository repository, ClientConverter converter, AddressService addressService) {
        this.repository = repository;
        this.converter = converter;
        this.addressService = addressService;
    }

    public List<Client> getAllClients() {
        return repository.findAll();
    }

    public Client getClientByName(String name) {
        return repository.getClientByName(name);
    }

    public void addClient(Client client) {
        client.setAddress(addressService.getLastAddress());
        repository.save(client);
    }


}
