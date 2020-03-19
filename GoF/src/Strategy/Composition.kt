package Strategy

internal class Composition {

	var compositor: Compositor;

	public constructor(compositor: Compositor) {
		this.compositor = compositor;
	}

	public fun compose(x: Int, y: Int): Int {
		return this.compositor.compose(x, y);
	}
}