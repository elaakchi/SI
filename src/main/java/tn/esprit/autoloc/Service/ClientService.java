package tn.esprit.autoloc.Service;

import lombok.AllArgsConstructor;
import tn.esprit.autoloc.Repositories.ClientRepository;
import tn.esprit.autoloc.entities.Client;

import java.util.List;

@AllArgsConstructor
public class ClientService implements Iclient{
    ClientRepository Client;
    @Override
    public Client AddClient(Client client) {
        return Client.save(client);
    }

    @Override
    public Client UpdateClient(Client client) {
        return Client.save(client);
    }

    @Override
    public List<Client> FindAllClient() {
        return Client.findAll();
    }

    @Override
    public void deleteClient(Client client) {
        Client.delete(client);
    }
}
