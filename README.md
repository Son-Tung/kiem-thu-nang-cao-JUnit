https://chatgpt.com/share/677f525a-69c4-8002-9791-ed25119aaf0b
# JUnit Advanced Testing: Algorithms and Test Coverage

This project demonstrates advanced testing with **JUnit** for common algorithms, emphasizing diverse control structures and data structures. The project also includes a guide to measure and achieve 100% test coverage (statement coverage).

---

## 📜 **Project Overview**

The project implements and tests the following algorithms:

1. **Find Max**: Find the maximum value in an array of integers.
2. **Check Prime**: Determine if a given integer is a prime number.
3. **FizzBuzz**: Generate a FizzBuzz string based on the input integer.

Each algorithm is tested using **JUnit 5**, covering edge cases, boundary conditions, and diverse inputs. 

Additionally, this project explores how to:
- Measure test coverage using tools like **Jacoco** or IDE-integrated solutions.
- Achieve 100% **statement coverage** by adding missing test cases.

---

## 📂 **Project Structure**

```
.
├── src
│   ├── main
│   │   └── java
│   │       └── Algorithms.java      # Main algorithms implementation
│   └── test
│       └── java
│           └── AlgorithmsTest.java  # JUnit test cases
└── README.md                        # Documentation
```

---

## 🚀 **Algorithms Description**

### 1. **Find Max**
Finds the maximum value in an array of integers.

```java
public int findMax(int[] nums) {
    if (nums == null || nums.length == 0) {
        throw new IllegalArgumentException("Array cannot be null or empty");
    }
    int max = nums[0];
    for (int num : nums) {
        if (num > max) {
            max = num;
        }
    }
    return max;
}
```

### 2. **Check Prime**
Checks if an integer is a prime number.

```java
public boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
```

### 3. **FizzBuzz**
Generates a FizzBuzz string based on the input integer.

- Returns `FizzBuzz` if divisible by both 3 and 5.
- Returns `Fizz` if divisible by 3 only.
- Returns `Buzz` if divisible by 5 only.
- Otherwise, returns the number as a string.

```java
public String fizzBuzz(int n) {
    if (n % 3 == 0 && n % 5 == 0) {
        return "FizzBuzz";
    } else if (n % 3 == 0) {
        return "Fizz";
    } else if (n % 5 == 0) {
        return "Buzz";
    } else {
        return String.valueOf(n);
    }
}
```

---

## ✅ **Testing with JUnit**

JUnit test cases for all methods, including edge cases:

```java
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
}
```

---

## 📊 **Measuring Test Coverage**

Test coverage measures the percentage of your code executed during tests. Achieving high coverage ensures better reliability.

### **Tools**
- **Jacoco**: A Maven plugin to measure code coverage.
- **EclEmma**: An Eclipse plugin for real-time coverage analysis.
- **IntelliJ IDEA**: Built-in code coverage tool.

### **Steps to Measure Coverage in IntelliJ**
1. Right-click `AlgorithmsTest.java` and select `Run with Coverage`.
2. View the coverage report:
   - **Green**: Code executed during tests.
   - **Red**: Code not executed.

---

## 🛠 **Achieving 100% Coverage**

After measuring coverage, you may find untested branches. Add specific test cases to cover them. For example:

#### Missing Edge Cases
- Null or empty array in `findMax`.
- Non-positive integers in `isPrime`.

#### Additional Test Cases
```java
@Test
public void testFindMaxEdgeCases() {
    assertThrows(IllegalArgumentException.class, () -> algorithms.findMax(null));
    assertThrows(IllegalArgumentException.class, () -> algorithms.findMax(new int[]{}));
}

@Test
public void testIsPrimeEdgeCases() {
    assertFalse(algorithms.isPrime(-5)); // Negative numbers
    assertFalse(algorithms.isPrime(0));  // Zero
}
```

---

## ⚙️ **How to Run the Project**

### Prerequisites
- **Java 8+**
- **JUnit 5**
- IDE (Eclipse/IntelliJ IDEA) or Maven for build management.

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/junit-algorithms-test.git
   ```
2. Open the project in your IDE.
3. Run the test cases:
   - IntelliJ: Right-click `AlgorithmsTest` → Run Tests.
   - Maven: Run `mvn test`.

---

## 📈 **Expected Output**

When all test cases pass and coverage is 100%, the output should show:

1. **JUnit Output**: All tests passed.
2. **Coverage Report**: 
   - **Statement Coverage**: 100%.
   - **Branch Coverage**: 100%.


---

## 🔗 **Resources**

- [JUnit 5 Documentation](https://junit.org/junit5/docs/current/user-guide/)
- [Jacoco Coverage Plugin](https://www.jacoco.org/jacoco/)
- [EclEmma for Eclipse](https://www.eclemma.org/)

---

## 🖋 **Author**

- Name: Nguyen Son Tung 
- GitHub: [Son-Tung](https://github.com/Son-Tung)

Feel free to contribute or suggest improvements!


