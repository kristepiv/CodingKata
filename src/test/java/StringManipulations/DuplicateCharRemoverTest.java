package StringManipulations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateCharRemoverTest {

    @Test
    public void removeDuplicates() {
        assertEquals("hot", DuplicateCharRemover.removeDuplicateChar("hhott"));
    }
}