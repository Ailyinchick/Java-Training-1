import java.util.*;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		sortDesc(1234598765);
		
	}
	
	
//  Task: sortDesc	
//	Your task is to make a function that can take any non-negative integer as an argument 
//	and return it with its digits in descending order. 
//	Essentially, rearrange the digits to create the highest possible number.
//			Examples:
//			Input: 42145 Output: 54421
//			Input: 145263 Output: 654321
//			Input: 123456789 Output: 987654321
	  private static int sortDesc(final int num) {
		  int[] arr = String.valueOf(num).chars().sorted().toArray();
		  StringBuilder ans = new StringBuilder(arr.length);
		  for (int i = 0; i < arr.length; i++) {
			ans.append((char)arr[i]);
		  }
		  return Integer.valueOf(ans.reverse().toString());
	  }
	
	private static int[] subArray(int[] a, int[] b) {
		List<Integer> arrA = Arrays.stream(a).boxed().collect(Collectors.toList());
		List<Integer> arrB = Arrays.stream(b).boxed().collect(Collectors.toList());
		arrA.removeAll(arrB);
		return arrA.stream().mapToInt(e -> e.intValue()).toArray();
	}

	private static int findIt(int[] a) {
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
	    }
	    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	    	if (entry.getValue() % 2 == 1) return entry.getKey();
	    }
  	    return 0;
    }
	
	
	private static int[] minMax(int[] arr) {
		
		Arrays.stream(arr).min().getAsInt();
		
		return arr;
	}

    private static String whoLikesIt(String... names) {
      if (names.length == 0) return "no one likes this";
      names[0].toLowerCase().chars().forEach((a) -> {
    	  System.out.println(a);
      });
      return "";
    }
	
	
	private static String values(String values) {
		List<Integer> arr = Arrays.stream(values.split(" "))
				.map((s) -> Integer.valueOf(s)).sorted().collect(Collectors.toList());
		if (arr.size() < 2) return "";
		return arr.get(arr.size()-1) + " " + arr.get(0);
	}
	
	private static String areYouPlayingBanjo(String name) {
		if (name.length() == 0) return "";
		if (name.charAt(1) == 'R' || name.charAt(1) == 'r') {
			return name + " plays banjo";
		} else {
			return name + " does not play banjo";
		}
	}
	
	private static String correctSplitStr(String str) {
		return str.replaceAll( "([A-Z])", " $1");
	}
	
	private static String splitStr(String str) {
		StringBuilder builder = new StringBuilder();
		for (Character c: str.toCharArray()) {
			if (Character.isUpperCase(c)) builder.append(' ');
			builder.append(c);
		}
		return builder.toString();
	}
	
	private static void checkMultiThreading() {
		Runnable mike = () -> System.out.println("Hi from Thread");
		mike.run();
		
		synchronized(mike) {
			try {
				mike.wait(50);
				System.out.println("From wait()");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("ASD");
	}

}
