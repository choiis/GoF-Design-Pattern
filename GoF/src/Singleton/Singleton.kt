package Singleton

class Singleton {

	// or private
	protected constructor() {

	};
	// static 
	companion object {

		private var instance: Singleton = Singleton();

		public fun getInstance(): Singleton {
			return instance;
		}
	}

	public fun log() {
		println("Singleton method call");
	}
}