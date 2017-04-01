package co.edu.uniquindio.logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;

public class Utilities {

	public static boolean ping(String ipAddress) throws IOException {
		InetAddress address;
		try {
			address = InetAddress.getByName(ipAddress);
			if (address.isReachable(5000)) {
				return true;
			} else {
				return false;
			}
		} catch (IOException ex) {
			return false;
		}

	}
	
	
	
	

}
