import com.deno4ka.LeetCode.algorithms.easy._475_Heaters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _475_HeatersTest {

	private _475_Heaters heaters = new _475_Heaters();

	@Test
	public void firstTest() {
		assertEquals(1, heaters.findRadius(new int[] {1,2,3}, new int[] {2}));
	}

	@Test
	public void secondTest() {
		assertEquals(1, heaters.findRadius(new int[] {1,2,3,4}, new int[] {1,4}));
	}

}