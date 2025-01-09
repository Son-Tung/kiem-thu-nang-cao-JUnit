package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AlgorithmsTest {

    Algorithms algorithms = new Algorithms();

    // Test findMax
    @Test
    public void testFindMax() {
        assertEquals(5, algorithms.findMax(new int[]{1, 2, 3, 4, 5}));
        assertEquals(-1, algorithms.findMax(new int[]{-5, -2, -3, -1}));
        assertThrows(IllegalArgumentException.class, () -> algorithms.findMax(null));
        assertThrows(IllegalArgumentException.class, () -> algorithms.findMax(new int[]{}));
    }

    // Test isPrime
    @Test
    public void testIsPrime() {
        assertTrue(algorithms.isPrime(2));
        assertTrue(algorithms.isPrime(13));
        assertFalse(algorithms.isPrime(4));
        assertFalse(algorithms.isPrime(-1));
        assertFalse(algorithms.isPrime(1));
    }

    // Test fizzBuzz
    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", algorithms.fizzBuzz(15));
        assertEquals("Fizz", algorithms.fizzBuzz(9));
        assertEquals("Buzz", algorithms.fizzBuzz(10));
        assertEquals("7", algorithms.fizzBuzz(7));
    }

    @Test
    public void testFindMaxEdgeCases() {
        assertThrows(IllegalArgumentException.class, () -> algorithms.findMax(null));
        assertThrows(IllegalArgumentException.class, () -> algorithms.findMax(new int[]{}));
    }

    @Test
    public void testIsPrimeEdgeCases() {
        assertFalse(algorithms.isPrime(-5)); // Số âm
        assertFalse(algorithms.isPrime(0));  // Không phải số nguyên tố
    }
}


