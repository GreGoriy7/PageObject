package GB;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void main() {
        Triangle triangle = new Triangle();
        int actual = Triangle.main(6);
        int expected = 6;
        assertEquals(expected, actual);

    }
}