package guru.springframework.spring6resttemplate.client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BeerClientImplTest {

    @Autowired
    BeerClient beerClient;

    @Test
    void listBeersNoParameters() {
        beerClient.listBeers();
    }

    @Test
    void listBeersWithNameParameter() {
        beerClient.listBeers("ALE", null, null, null, null);
    }
}