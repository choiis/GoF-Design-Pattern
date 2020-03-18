package Prototype


class ProtoType : Cloneable {

	private var list: ArrayList<Int>;

	constructor() {
		this.list = ArrayList<Int>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
	}

	constructor(list: ArrayList<Int>) {
		this.list = list
	}


	public fun printing() {

		list.forEach { i ->
			print(" " + i + " ");
		};
		println();

	}

	public fun add(int: Int) {
		list.add(int);
	}

	@Throws(CloneNotSupportedException::class)
	public override fun clone(): ProtoType { // covariant return type
		val temp = ArrayList<Int>();
		for (s in this.list) {
			temp.add(s);
		}
		return ProtoType(temp);
	}
}