package Prototype

fun main(args: Array<String>) {

	var proto1: ProtoType = ProtoType();
	var proto2: ProtoType = proto1.clone();
	proto2.add(5);
	proto1.printing();
	proto2.printing();
	println(proto1);
	println(proto2);
}