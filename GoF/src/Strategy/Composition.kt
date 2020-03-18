package Strategy

class Composition {

	private var compositor: Compositor;

	public constructor(compositor: Compositor) {
		this.compositor = compositor;
	}

	public fun setCompositor(compositor: Compositor) {
		this.compositor = compositor;
	}

	public fun compose(x: Int, y: Int): Int {
		return this.compositor.compose(x, y);
	}
}