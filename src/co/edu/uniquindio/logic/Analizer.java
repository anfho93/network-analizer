package co.edu.uniquindio.logic;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Analizer {

	private InetAddress ip;
	private NetworkInterface iface;
	private String mask;
	private String hrdadd;

	public Analizer() throws UnknownHostException, SocketException {
		ip = InetAddress.getLocalHost();
		iface = NetworkInterface.getByInetAddress(ip);
		mask = iface.getInterfaceAddresses().get(0).getNetworkPrefixLength() + "";
		hrdadd = iface.getHardwareAddress().toString() + "";
	}

	/**
	 * Prints the information about the localhost
	 */
	public String toString() {
		String output;
		output = "The Ip address is: " + ip.getHostAddress();
		output += "\\nThe interface mask is: " + iface.getInterfaceAddresses().get(0).getNetworkPrefixLength();
		output += "\\nThe hardware address: " + hrdadd;

		return output;
	}

	public static void main(String[] args) {
		try {
			Analizer analizer = new Analizer();
			System.out.println(analizer.toString());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * 
	 */
	public void checkAvailableHosts() {

	}

}
