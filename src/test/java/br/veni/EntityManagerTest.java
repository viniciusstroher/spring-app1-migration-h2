package br.veni;

import org.springframework.boot.test.context.SpringBootTest;
import org.junit.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootTest
public class EntityManagerTest {

    private static EntityManagerFactory entityManagerFactory;

    private EntityManager entityManager;

    @BeforeClass
    public static void setUpBeforeClass() {
        entityManagerFactory = Persistence
                .createEntityManagerFactory("app");
        System.out.println(" Iniciando db");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        entityManagerFactory.close();
    }

    @Before
    public void setUp() {
        entityManager = entityManagerFactory.createEntityManager();
    }

    @After
    public void tearDown() {
        entityManager.close();
    }

}
