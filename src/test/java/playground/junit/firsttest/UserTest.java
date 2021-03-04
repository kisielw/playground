package playground.junit.firsttest;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("User Class Test Suite")   //służy do wpisania, co testujemy, przydaje się w raportowaniu testów
class UserTest {

    @BeforeAll  // musi być statyczna, bo ona musi zadziałać jeszcze przed stworzeniem tej klasy
    static void before() {
        System.out.println("Test suite: start");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Test case: start");
    }

    @AfterEach
    void afterEach() {
        System.out.println("Test case: end");
    }

    @AfterAll
    static void after() {
        System.out.println("Test suite: end");
    }

    // kiedy moja klasa User będzie działać dobrze?
    //jeżeli wywołamy metodę getUserName() i dostaniemy oczekiwaną wartość.
    // User karol = new User("Karol")
    // oczekuję, że getUserName() zwróci Karol

    //@Disabled //  - ignoruje dany test, jak nie chcemy go testować, ale można też go zakomentować
    @Test
    @DisplayName("When user is created then getUserName method should return correct name")
    void test() {
        //given                    //tutaj wpisujemy dane, które będziemy wykorzystywać - sekcja przygotowawcza
        User user = new User("Karol", "MagicznyKarol");
        //when                    //co robimy z danymi z given - sekcja rozruchowa
        String userName = user.getUserName();
        //then                    //jakiego wyniku oczekujemy, wykonujemy tutaj asercję

        //junit5 - assertion
        Assertions.assertEquals("Karol", userName);

        //assertJ - assertion
        // org.assertj.core.api.Assertions.assertThat(); - jak kliknę na assertThat alt+enter zrobi się import statyczny i jest krócej jak niżej
        assertThat(userName)
                .isEqualTo("Karol")
                .startsWith("K")
                .endsWith("l")
                .isNotEmpty();
    }

    @Test
    @DisplayName("When user is created then getSpecificName method should return correct specific name")
    void test1() {
        //given
        User user = new User("Jacek", "Magiczny");
        //when
        String specificName = user.getSpecificName();
        //then
        Assertions.assertEquals("Jacek_Magiczny", specificName);
    }

}