package root.business.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import root.entities.Client;

import java.util.List;

@CrossOrigin
@RestController
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping("/clients")
    public ResponseEntity<List<Client>> getAllClients() {
        List<Client> clients = service.getAllClients();
        return clients.isEmpty() ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(clients,
                HttpStatus.OK);
    }

//    @GetMapping("/clients/{name}")
//    public ResponseEntity<ClientDto> getClientByName(@PathVariable String name) {
//        Client entity = service.getClientByName(name);
//        ClientDto dto = converter.convert(entity);
//        return dto == null ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(dto,
//                HttpStatus.OK);
//    }

    @PostMapping("/clients")
    public ResponseEntity<Void> addClient(@RequestBody Client client) {
        service.addClient(client);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
