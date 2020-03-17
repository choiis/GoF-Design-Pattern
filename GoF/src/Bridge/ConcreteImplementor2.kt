package Bridge

class ConcreteImplementor2 : Implementor {

	private var str: String;
	private var leng: Int;

	public constructor(str: String) {
		this.str = str;
		this.leng = str.length;
	}

	override fun printing() {
		println("xxx " + str);
	}

	override fun length() {
		println("long " + leng);
	}
}