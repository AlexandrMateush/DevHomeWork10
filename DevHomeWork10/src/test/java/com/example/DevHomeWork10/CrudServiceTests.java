package com.example.DevHomeWork10;

import com.example.DevHomeWork10.entity.ClientCrudService;
import com.example.DevHomeWork10.entity.PlanetCrudService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
public class CrudServiceTests {

	@Autowired
	private ClientCrudService clientCrudService;

	@Autowired
	private PlanetCrudService planetCrudService;

	@Test
	public void testClientCrudOperations() {

		Client client = new Client();
		client.setName("John Doe");
		clientCrudService.createClient(client);


		Client retrievedClient = clientCrudService.getClientById(client.getId());
		assert retrievedClient != null;
		assert retrievedClient.getName().equals("John Doe");


		retrievedClient.setName("Jane Smith");
		clientCrudService.createClient(retrievedClient);
		Client updatedClient = clientCrudService.getClientById(retrievedClient.getId());
		assert updatedClient != null;
		assert updatedClient.getName().equals("Jane Smith");


		clientCrudService.deleteClientById(updatedClient.getId());
		Client deletedClient = clientCrudService.getClientById(updatedClient.getId());
		assert deletedClient == null;
	}

	@Test
	public void testPlanetCrudOperations() {

		Planet planet = new Planet();
		planet.setId("MARS1");
		planet.setName("Mars");
		planetCrudService.createPlanet(planet);


		Planet retrievedPlanet = planetCrudService.getPlanetById(planet.getId());
		assert retrievedPlanet != null;
		assert retrievedPlanet.getName().equals("Mars");


		retrievedPlanet.setName("Red Planet");
		planetCrudService.createPlanet(retrievedPlanet);
		Planet updatedPlanet = planetCrudService.getPlanetById(retrievedPlanet.getId());
		assert updatedPlanet != null;
		assert updatedPlanet.getName().equals("Red Planet");


		planetCrudService.deletePlanetById(updatedPlanet.getId());
		Planet deletedPlanet = planetCrudService.getPlanetById(updatedPlanet.getId());
		assert deletedPlanet == null;
	}
}
