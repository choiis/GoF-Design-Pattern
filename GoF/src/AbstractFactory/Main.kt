package AbstractFactory

import java.util.Scanner

fun main(args: Array<String>) {

	val sc: Scanner = Scanner(System.`in`);
	val case: Int = sc.nextInt();

	val fac: ProductFactory;

	when (case) {
		1 -> fac = ConcreteFactory1();
		2, 4, 6, 8, 10 -> fac = ConcreteFactory2();
		else -> fac = ConcreteFactory1();
	}

	val p: AbstractProducer = fac.produce();
	val c: AbstractConsumer = fac.consume();
	p.ppp();
	c.ccc();
}