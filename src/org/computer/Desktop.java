package org.computer;

public class Desktop extends Computer {
	private void desktopSize() {
		System.out.println("desktopSize");
	}
	public static void main(String[] args) {
		Desktop c=new Desktop();
		c.desktopSize();
		c.computerModel();
		
	}
}
