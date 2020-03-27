package State

class TCPConnection {
	private var state: TCPState;

	constructor() {
		this.state = TCPListen();
	}

	public fun changeState(state: TCPState) {
		this.state = state;
	}

	public fun sendPacket() {
		this.state.transmit();
	}

	public fun getState() {
		this.state.nowState();
	}
}