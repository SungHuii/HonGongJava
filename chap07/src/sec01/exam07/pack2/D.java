package sec01.exam07.pack2;

import sec01.exam07.pack1.A;

public class D extends A {
	public D() {
		// A a = new A(); 객체로 받으려면 protected가 아닌 public 이어야한다. 
		super();
		this.field = "value";
		this.method();
	}
}
