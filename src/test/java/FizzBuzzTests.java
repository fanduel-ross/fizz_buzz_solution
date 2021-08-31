import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTests {

    FizzBuzzSolver fizzb = new FizzBuzzSolver(1, 15);

    @Test
    public void multipleNumberTest() {
        assertTrue(fizzb.divisibleBy(3,3));
        assertFalse((fizzb.divisibleBy(3,4)));

    }


    @Test
    public void fizzBuzzSolutionTes2()
    {
        ArrayList<String> minTestList = new ArrayList<>(
                List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"));
        assertEquals(minTestList, fizzb.fizzBuzzSolution2());

    }}
