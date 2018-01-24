package jbr.javaconfig.model;

public class Wheel {

	private int size = 22;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void init() {
		System.out.println("wheel init()");
	}

	public void destroy() {
		System.out.println("wheel destroy()");
	}
}
