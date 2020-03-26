package Composite


class Composite : Component {

	private var list: ArrayList<Component>;

	constructor() {
		this.list = ArrayList<Component>();
	}

	override fun leaf() {
		this.list.forEach { i ->
			i.leaf();
		};
	}

	override fun add(component: Component) {
		list.add(component);
	}

	override fun remove(component: Component) {
		list.remove(component);
	}
}