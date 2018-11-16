package com.isaia.permoot;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public List<int[]> permutation(final int[] a) {
		List<int[]> results = new ArrayList<>();
		this.permutationRecursive(a, 0, results);

		return results;
	}

	private void permutationRecursive(final int[] a, final int start, final List<int[]> results) {
		if (start >= a.length) { // THE BASE CASE
			results.add(a.clone());
		} else {
			for (int i = start; i < a.length; i++) {
				this.swap(a, start, i); // do
				// CHANGING THE STATE AND GETTING CLOSER TO THE BASE CASE; RECURSIVE CALL
				this.permutationRecursive(a, start + 1, results);
				this.swap(a, start, i); // undo - backtracking
			}
		}
	}

	private void swap(final int[] a, final int i, final int j) {
		// THIS IS THE REAL LOGIC
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
