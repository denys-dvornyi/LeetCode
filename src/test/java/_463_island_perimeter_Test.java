import com.deno4ka.LeetCode.algorithms.easy._463_island_perimeter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Island Perimeter #463")
public class _463_island_perimeter_Test {

	private _463_island_perimeter islandPerimeter = new _463_island_perimeter();

	@Test
	public void test() {
		assertEquals(16, islandPerimeter.islandPerimeter(new int[][] {new int[]{0,1,0,0}, new int[]{1,1,1,0}, new int[]{0,1,0,0}, new int[]{1,1,0,0}}));
	}

}