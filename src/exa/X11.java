package exa;//mogi43

public class X11 {
	int a;
	static int b;
	
	X11(){
		int i = 0;
		while(i<5) {
			i++; a++; b++;
		}
	}
	public static void main(String[] args) {
		X11 o1 = new X11();
		X11 o2 = new X11();
		System.out.println(o1.a + " " + X11.b);
		//System.out.println(o2.a + " " + o2.b);
	}

}
