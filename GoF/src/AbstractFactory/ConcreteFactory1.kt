package AbstractFactory

class ConcreteFactory1() : ProductFactory {

	override fun produce(): AbstractProducer {
		return Producer1();
	}

	override fun consume(): AbstractConsumer {
		return Consumer1();
	}
}