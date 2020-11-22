# Calculator test

Uruchom istniejący już test wewnątrza 'CalculatorTests', powinien przejść pomyślnie.

# Ćwieczenie

1. Dodaj 3 testy do istniejącego przy użyciu różnych parametrów. Oto kilka przykładów, ale zachęcam do skorzystania z własnych:

        0 + 101
        -5 + -2
        -1 + 5

2. Dodaj nową metodę o nazwie `substract` do klasy` Calculator`.

        public int substract (int a, int b) {
             return -1;
        }

3. Dodaj testy obejmujące tę metodę.
4. Powtórz proces, implementując kolejne metody (multiply, divide, power), dodając 2-3 testy dla każdej nowej metody:
* `multiply` - metoda, pozwalająca na pomnożenie dwóch elementów. Przykład:

      calc.multiply (2, 3) powinien wrócić 6

* `divide` - umożliwia dzielenie dwóch elementów

      calc.divide (2, 2) powinien zwrócić 1

* `power` - pozwalając ci na podniesienie danej liczby do wybranej potęgi. Przykład:

      calc.power (2, 10) powinien zwrócić 1024
