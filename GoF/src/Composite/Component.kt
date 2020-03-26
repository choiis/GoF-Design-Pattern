package Composite

abstract class Component {

	open fun leaf() {

	}

	open fun add(component: Component) {
		println("void " + component);
	}

	open fun remove(component: Component) {
		println("void " + component);
	}
}