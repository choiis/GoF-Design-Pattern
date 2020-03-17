package Bridge

class ConcreteImplementor1 : Implementor {

	private var str: String;
	private var leng: Int;

	public constructor(str: String) {
		this.str = str;
		this.leng = str.length;
	}

	override fun printing() {
		println("yyy " + str);
	}

	override fun length() {
		println("int " + leng);
	}
}