package br.veni;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.*;

import br.veni.model.User;
import javax.transaction.Transactional;

@SpringBootTest
public class UsersTest extends EntityManagerTest {

    @Transactional
    @Test
    public void createUserTest() {
        User user = new User();

        user.setName("José Lucas");
        entityManager.persist(user);

        User userVerify = entityManager.find(User.class, user.getId());
        Assert.assertNotNull(userVerify);
    }

}
