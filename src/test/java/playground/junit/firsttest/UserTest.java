package playground.junit.firsttest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    // kiedy moja klasa User będzie działać dobrze?
    //jeżeli wywołamy metodę getUserName() i dostaniemy oczekiwaną wartość.
    // User karol = new User("Karol")
    // oczekuję, że getUserName() zwróci Karol

    @Test
    void testUserName() {
        //given                    //tutaj wpisujemy dane, które będziemy wykorzystywać - sekcja przygotowawcza
        User user = new User("Karol", "MagicznyKarol");
        //when                    //co robimy z danymi z given - sekcja rozruchowa
        String userName = user.getUserName();
        //then                    //jakiego wyniku oczekujemy, wykonujemy tutaj asercję
        Assertions.assertEquals("Karol", userName);
    }

    @Test
    void testSpecificName() {
        //given
        User user = new User("Jacek", "Magiczny");
        //when
        String specificName = user.getSpecificName();
        //then
        Assertions.assertEquals("Jacek_Magiczny", specificName);
    }

}