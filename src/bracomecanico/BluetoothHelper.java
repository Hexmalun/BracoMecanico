package bracomecanico;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.microedition.io.Connector;
import javax.microedition.io.StreamConnection;
/**
 * Created by Felipe on 2016-10-11.
 */
public class BluetoothHelper{

	private static OutputStream os;

	public static void conect() throws IOException{
		String serverURL = "btspp://98D331709FD2:1;authenticate=false;encrypt=false;master=false";
		
		System.out.println("Connecting to " + serverURL);


		StreamConnection stream;
            //try {
                stream = (StreamConnection) Connector.open(serverURL);
                os = stream.openOutputStream();
            //} catch (IOException ex) {
              //  Logger.getLogger(BluetoothHelper.class.getName()).log(Level.SEVERE, null, ex);
            //}

		
	}


	public static void send(String s){
		PrintWriter pWriter=new PrintWriter(new OutputStreamWriter(os));
		pWriter.print(s);
		pWriter.flush();
	}
}
