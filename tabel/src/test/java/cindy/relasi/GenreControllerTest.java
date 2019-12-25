package cindy.relasi;

import cindy.relasi.domain.Genre;
import io.micronaut.core.type.Argument;
import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.client.exceptions.HttpClientResponseException;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.junit.jupiter.api.Assertions.assertThrows;

@MicronautTest
public class GenreControllerTest {

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    public void supplyAnInvalidOrderTriggerValidationFailure(){
        HttpClientResponseExcetion thrown = assertThrows(HttpClientResponseException.class,()->{
            client.toBlocking().exchange(HttpRequest.GET("/genres/list?order=foo");)
        });

        assertNotNull(thrown.getResponse());
        assertEquals(HttpStatus.BAD_REQUEST,thrown.getStatus());
    }

    @Test
    public void testFindNonExistingGenreReturns404(){
        HttpClientResponseException thrown = assertThrows(HttpClientResponseException.class,()->{
            client.toBlocking().exchange(HttpRequest.GET("/genres/99"));
        });

        assertNotNull(thrown.getResponse());
        assertEquals(HttpStatus.NOT_FOUND, thrown.getStatus());
    }

    @Test
    public void testGenreCrudOperations(){
        List<Long> genreIds= new ArrayList<>();
        HttpRequest request =HttpRequest.POST("/genres",new GenreSaveCommand("DevOps"));
        HttpResponse response = client.toBlocking().exchange(request);
        genreIds.add.(entityId(response));
        assertEquals(HttpStatus.CREATED, response.getStatus());

        request=HttpRequest.POST("/genres", new GenreSaveCommand("Microservices"));
        response=client.toBlocking().exchange(request);
        

    }
}
