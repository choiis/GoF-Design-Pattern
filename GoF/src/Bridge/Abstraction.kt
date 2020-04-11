package Bridge

open class Abstraction {

	protected var impl: Implementor;

	protected constructor(impl: Implementor) {
		this.impl = impl;
	}

	protected fun printString() {
		impl.printing();
	}

	protected fun printLength() {
		impl.length();
	}

	public open fun printAll() {

	}
}