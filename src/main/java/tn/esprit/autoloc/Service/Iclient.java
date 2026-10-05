package tn.esprit.autoloc.Service;

import tn.esprit.autoloc.entities.Client;

import java.util.List;

public interface Iclient  {

    public Client  AddClient(Client client );
    public Client UpdateClient (Client client);
    public List<Client> FindAllClient ();
    public void deleteClient(Client client);

}