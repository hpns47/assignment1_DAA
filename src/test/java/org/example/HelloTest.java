package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    void additionWorks() {
        int sum = 2 + 2;
        assertEquals(4, sum, "2 + 2 должно быть равно 4");
    }
}
