import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedWithBug() {
    int[] input = { 1, 2, 3 };
    assertArrayEquals(new int[]{ 3, 2, 1 }, ArrayExamples.reversed(input));
}
    
  @Test
  public void testAverageWithoutLowest() {
      double[] input = { 3.0, 1.0, 2.0, 4.0, 5.0 };
      double expected = 3.5;
      
      double result = ArrayExamples.averageWithoutLowest(input);
      assertEquals(expected, result, 0.001);
  }
}
