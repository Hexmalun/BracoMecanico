package bracomecanico;

import java.io.OutputStream;
/**
 * Created by Felipe on 2016-10-11.
 */
public class BluetoothHelper{

	private static OutputStream os;

	public static void conect(){
		String serverURL = "btspp://98D331709FD2:1;authenticate=false;encrypt=false;master=false";
		if ((args != null) && (args.length > 0)) {
			serverURL = args[0];
		}
		if (serverURL == null) {
			String[] searchArgs = null;
			// Connect to OBEXPutServer from examples
			//searchArgs = new String[] { "11111111111111111111111111111123" };
			ServicesSearch.main(searchArgs);
			if (ServicesSearch.serviceFound.size() == 0) {
				System.out.println("OBEX service not found");
				return;
			}
			// Select the first service found
			serverURL = (String)ServicesSearch.serviceFound.elementAt(0);
		}

		System.out.println("Connecting to " + serverURL);


		StreamConnection stream = (StreamConnection) Connector.open(serverURL);

		os = stream.openOutputStream();
	}


	public static void send(String s){
		PrintWriter pWriter=new PrintWriter(new OutputStreamWriter(os));
		pWriter.print(s);
		pWriter.flush();
	}
}
