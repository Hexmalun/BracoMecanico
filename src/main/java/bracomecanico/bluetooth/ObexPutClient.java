package bracomecanico.bluetooth;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import javax.microedition.io.Connector;
import javax.microedition.io.StreamConnection;
import javax.obex.*;

public class ObexPutClient {

	public static void main(String[] args) throws IOException, InterruptedException {

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

		OutputStream outStream=stream.openOutputStream();
		PrintWriter pWriter=new PrintWriter(new OutputStreamWriter(outStream));

		byte data[] = "0/100,100,50,70,50,60,30".getBytes("iso-8859-1");

		pWriter.print("0/100,100,50,70,50,60,30");
		pWriter.flush();

		/*
		ClientSession clientSession = (ClientSession) Connector.open(serverURL);
		HeaderSet hsConnectReply = clientSession.connect(null);
		if (hsConnectReply.getResponseCode() != ResponseCodes.OBEX_HTTP_OK) {
			System.out.println("Failed to connect");
			return;
		}

		HeaderSet hsOperation = clientSession.createHeaderSet();
		hsOperation.setHeader(HeaderSet.NAME, "ok");
		hsOperation.setHeader(HeaderSet.TYPE, "text");

		//Create PUT Operation
		Operation putOperation = clientSession.put(hsOperation);

		// Send some text to server
		byte data[] = "0/100,125,75,105,85,80,60".getBytes("iso-8859-1");
		OutputStream os = putOperation.openOutputStream();
		os.write(data);
		os.close();

		putOperation.close();

		clientSession.disconnect(null);

		clientSession.close();*/
	}
}