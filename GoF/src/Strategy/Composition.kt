package Strategy

internal class Composition {

	private var compositor: Compositor;

	public constructor(compositor: Compositor) {
		this.compositor = compositor;
	}

	public fun compose(compositor: Compositor, x: Int, y: Int): Int {
		this.compositor = compositor;
		return this.compositor.compose(x, y);
	}

	public fun compose(x: Int, y: Int): Int {
		return this.compositor.compose(x, y);
	}
}