package Bridge

// define constructor once
class RefinedAbstraction(impl: Implementor) : Abstraction(impl) {

	public fun printAll() {
		impl.printing();
		impl.length();
	}
}