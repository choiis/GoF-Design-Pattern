package AbstractFactory

interface ProductFactory {

	fun produce(): AbstractProducer;

	fun consume(): AbstractConsumer;
}

interface AbstractProducer {
	fun ppp();
}

interface AbstractConsumer {
	fun ccc();
}

class Producer1() : AbstractProducer {
	override fun ppp() {
		println("p1");
	}
}

class Producer2() : AbstractProducer {
	override fun ppp() {
		println("p2");
	}
}

class Consumer1() : AbstractConsumer {
	override fun ccc() {
		println("c1");
	}
}

class Consumer2() : AbstractConsumer {
	override fun ccc() {
		println("c2");
	}
}