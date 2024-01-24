package Q_연습;

public class Q04_path {
	
	public static void main(String[] args) {
		String path = "/Users/gudohyeon/eclipse-workspace/lesson/src/Q_연습/Q04_path.java";
		String[] pathArr = path.split("//");
		String filename = pathArr[pathArr.length - 1];
		System.out.println(filename);

		System.out.println(8 % 5);
	}
	
	

}
