package State

interface TCPState {

	fun transmit();

	fun nowState();

}

class TCPListen() : TCPState {
	override fun transmit() {
		println("wait client");
	}

	override fun nowState() {
		println("listen");
	}
}

class TCPEstablished() : TCPState {
	override fun transmit() {
		println("send packet");
	}

	override fun nowState() {
		println("established");
	}
}

class TCPClosed() : TCPState {
	override fun transmit() {
		println("disconnect");
	}

	override fun nowState() {
		println("closed");
	}
}