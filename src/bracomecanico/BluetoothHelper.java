package bracomecanico;

import java.io.OutputStream;
/**
 * Created by Felipe on 2016-10-11.
 */
public class BluetoothHelper{

	private static OutputStream os;

	public static void conect(){

		// TODO

	}


	public static void send(String s){
		os.write(s);
	}
}
