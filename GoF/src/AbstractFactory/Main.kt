package AbstractFactory

fun main(args: Array<String>) {

	val fac1: ProductFactory = ConcreteFactory1();
	val p1: AbstractProducer = fac1.produce();
	val c1: AbstractConsumer = fac1.consume();

	val fac2: ProductFactory = ConcreteFactory2();
	val p2: AbstractProducer = fac2.produce();
	val c2: AbstractConsumer = fac2.consume();

	p1.ppp();
	c1.ccc();
	p2.ppp();
	c2.ccc();
}