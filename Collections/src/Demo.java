import java.util.ArrayList;

public class Demo {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	System.out.println("size="+al.size());
	al.add(new Student("abc", 31, 99.6));
	al.add(new Student("hjk", 23, 92.6));
	al.add(new Student("agc", 36, 39.6));
	al.add(new Student("def", 45, 69.6));
	al.add(new Student("ghj", 16, 49.6));
	al.add(new Student("mnb", 1, 98.6));
	al.add("java");
	al.add("java");
	al.add(null);	
}
}
