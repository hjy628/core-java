package chap6.pair1;

import chap6.Pair;

public class PairTest1 {


	public static void main(String[] args) {
		String[] words = {"Mary","had","a","little","lamb"};
		Pair<String> mm = ArrayAlg.minmax(words);
		System.out.println("min = "+mm.getFirst());
		System.out.println("max = "+mm.getSecond());
	}
	
	
	 static class ArrayAlg{
		
		
		public static Pair<String> minmax(String[] a) {
			if (a == null || a.length == 0) {
				return null;
			}
			String minString = a[0];
			String maxString = a[0];
			for (int i = 1; i < a.length; i++) {
				if (minString.compareTo(a[i]) > 0) minString = a[i];
				if (maxString.compareTo(a[i]) < 0) maxString = a[i];
				}
			return new Pair<String>(minString,maxString);
		}
		
		
		
	}

}
