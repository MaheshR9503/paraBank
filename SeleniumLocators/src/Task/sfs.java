package Task;

import java.util.stream.IntStream;

public class sfs {
	public static void main(String[] args) {
		String s = "aabbc";
				IntStream stream = s.chars().distinct();
				System.out.println(stream);
	}

}
