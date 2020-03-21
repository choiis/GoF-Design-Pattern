package AbstractFactory

class ConcreteFactory2() : ProductFactory {

	override fun produce(): AbstractProducer {
		return Producer2();
	}

	override fun consume(): AbstractConsumer {
		return Consumer2();
	}
}