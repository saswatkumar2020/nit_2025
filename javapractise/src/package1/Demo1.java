package package1;

class A
{
	static int a=12;
	int b=15;
	@SuppressWarnings("removal")
	Integer ob1 =new Integer(12);
	@SuppressWarnings("removal")
	Integer ob2 =new Integer("13");
	static A ob4 = new A();
}

public class Demo1 {

	public static void main(String[] args) {
		//A ob3 =new A();
		System.out.println(A.ob4.ob1+A.ob4.ob2);
		System.out.println(A.ob4.b);
	}

}
