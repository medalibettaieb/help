package help;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class HelpBean {
	private String studentName = "Esprit Student";
	private String ipAddress;
	private String port;
	private String user;
	private String password;

	public String doSomeStuff() throws IOException {
		String command = "jboss-cli.bat --gui -u=" + user + " -p=" + password
				+ " --controller=" + ipAddress + ":" + port;

		ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c",
				"cd \"D:\\workJEE\\javaee7-tools\\servers\\wildfly-8.1.0.Final\\bin\" && "
						+ command);
		builder.redirectErrorStream(true).start();

		return "";
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
