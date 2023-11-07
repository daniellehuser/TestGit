package GitAssignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GitMathTest2 {

    GitMath gitmath;

    @BeforeEach
    void setUp() {
        gitmath = new GitMath();
    }

    @RepeatedTest(5)
    @DisplayName("Ensure correct handling of zero")
    void testMultiplyWithZero() {
        assertEquals(0, GitMath.multiply(0, 5), "Multiple with zero should be zero");
        assertEquals(0, GitMath.multiply(5, 0), "Multiple with zero should be zero");
    }
}