package Fenyuk_3;

public class Application {

	public static void main(String[] args) {
		
        Simple<String> strings = new SimpleArray<>();
        strings.add("first");
        strings.add("second");
        strings.add("tree");
        
        System.out.println(strings.get(0));
		System.out.println(strings.get(1));
		System.out.println(strings.get(2));
		
		System.out.println();
		
		strings.remove(1);
		
		System.out.println(strings.get(0));

	}

}
