package com.isaia.permoot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class PermutationTest {

	@Test
	void test() {
		int[] numbers = new int[] { 1, 2, 3 };

		Permutation permooter = new Permutation();

		List<int[]> permutations = permooter.permutation(numbers);
		List<String> expected = new ArrayList<>();
		expected.add("[1, 2, 3]");
		expected.add("[1, 3, 2]");
		expected.add("[2, 1, 3]");
		expected.add("[2, 3, 1]");
		expected.add("[3, 1, 2]");
		expected.add("[3, 2, 1]");

		assertEquals(expected.size(), permutations.size());

		for (int[] permutation : permutations) {
			assertTrue(expected.contains(Arrays.toString(permutation)));
		}

	}

}
