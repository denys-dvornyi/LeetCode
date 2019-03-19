import com.deno4ka.LeetCode.algorithms.easy._461_HammingDistance;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Hamming Distance #461")
public class _461_HammingDistanceTest {

	private _461_HammingDistance hammingDistanceTest = new _461_HammingDistance();

	@Test
	public void testEqualNumbers() {
		assertEquals(0, hammingDistanceTest.hammingDistance(1000, 1000));
	}

	@Test
	public void testHammingDistance1() {
		assertEquals(2, hammingDistanceTest.hammingDistance(1, 4));
	}

}