package Singleton

fun main(args: Array<String>) {

	var instance: Singleton = Singleton.getInstance();
	instance.log();
	// var singleton:Singleton = Singleton(); impossible

}