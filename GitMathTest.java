package GitAssignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class GitMathTest {
    GitMath gitmath;

    @BeforeEach
    void setUp() {
        gitmath = new GitMath();
    }

    @Test
    @DisplayName("Simple multiplication should work")
    void testMultiply() {
        assertEquals(20, GitMath.multiply(4, 5),
                "Regular multiplication should work");
    }


}