package ArraysManipulations;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    int[] nums = {1,3,2,1,2,3,5};
    int[] result = {1,3,2,5};


    @Test
    void removeDuplicatesWithStreams() {
        assertArrayEquals(result, RemoveDuplicates.removeDuplicatesWithStreams(nums));
    }
}