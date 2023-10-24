import java.util.*;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		String str = "Hello from project!";
		System.out.println(str);
//		int[] arr = new int[10];
//		List<String> list = Arrays.asList("a", "b", "c", "d", "e");
//		List<String> ans = new ArrayList<>();
//		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
//		int[] arr = list2.stream().map(x -> x.intValue()).collect(Collectors.toList()).toArray();
		
//		for (int i = 0; i < list.size(); i++) {
//		    ans.add("" + i + ": " + list.get(i));	
//		}
		
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
