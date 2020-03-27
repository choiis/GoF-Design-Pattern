package State

fun main(args: Array<String>) {

	var conn: TCPConnection = TCPConnection();
	conn.getState();
	conn.sendPacket();

	conn.changeState(TCPEstablished());
	conn.getState();
	conn.sendPacket();

	conn.changeState(TCPClosed());
	conn.getState();
	conn.sendPacket();
}