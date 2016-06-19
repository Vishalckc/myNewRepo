import java.lang.Runtime;
public class Demo {
	public static void main(String args[]) {

		int a=128;
		byte b=(byte)a;
		System.out.println(b);
		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("sun.arch.data.model"));
		System.out.println(Runtime.getRuntime().maxMemory());
		
	}

}
