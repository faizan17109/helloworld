package demo;

public class Hello {
public static void main(String[] args) {
	int num=2;
	for (int i=1;i<=10;i++) {
		int count=i*num;
		System.out.print(num + "*" + i + "=" + count);
		System.out.println();
	}
}
}
