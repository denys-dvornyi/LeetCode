import com.deno4ka.LeetCode.algorithms.easy._463_island_perimeter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Island Perimeter #463")
public class _463_island_perimeter_Test {

	private _463_island_perimeter islandPerimeter = new _463_island_perimeter();

	@Test
	public void test16Lands() {
		assertEquals(16, islandPerimeter.islandPerimeter(new int[][] {new int[]{0,1,0,0}, new int[]{1,1,1,0}, new int[]{0,1,0,0}, new int[]{1,1,0,0}}));
	}

	@Test
	public void test4Lands() {
		assertEquals(4, islandPerimeter.islandPerimeter(new int[][] {new int[]{1} }));
	}

	@Test
	public void test8Lands() {
		assertEquals(8, islandPerimeter.islandPerimeter(new int[][] {new int[]{1,1}, new int[]{1,0} })); // [[1,1],[1,0]]
	}

	@Test
	public void testFourLands() {
		assertEquals(4, islandPerimeter.islandPerimeter(new int[][] {new int[]{1, 0} }));
	}

}