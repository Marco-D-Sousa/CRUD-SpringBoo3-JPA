package my.crud.config;

import my.crud.entities.User;
import my.crud.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Xunda", "xunda@email.com", "1234-4332", "12345");
        User u2 = new User(null, "Fulano", "fulano@email.com", "8976-4332", "12345");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
