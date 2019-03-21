import com.deno4ka.LeetCode.algorithms.easy._475_Heaters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class _475_HeatersJUnit4Test {

	private _475_Heaters heatersImpl = new _475_Heaters();

	@Parameter(value = 0)
	public int[] houses;
	@Parameter(value = 1)
	public int[] heaters;
	@Parameter(value = 2)
	public int expected;

	@Parameters(name = "findRadius #{index}")
	public static Collection<Object[]> data() {
		return asList(new Object[][] {
				{new int[]{1, 2, 3}, new int[]{2}, 1},
				{new int[]{1, 2, 3, 4}, new int[]{1, 4}, 1},
				{new int[]{1}, new int[]{1, 2, 3, 4}, 0},
				{new int[] {1,2,3,5,15}, new int[] {2,30}, 13}
		});
	}

	@Test
	public void findRadius() {
		assertThat(heatersImpl.findRadius(houses, heaters), is(expected));
	}

}