package Facade

fun main(args: Array<String>) {

	val facadeApi: Facade = Facade();

	println(facadeApi.restapi("xss"));
	println(facadeApi.restapi("forbidden"));
	println(facadeApi.restapi("unauthorized"));
	println(facadeApi.restapi("injection"));
	println(facadeApi.restapi("normal"));

}