package ws;

import javax.jws.WebService;

@WebService
public interface Demo {

	public String exibeHelloWorld();
	
	public String exibeHi(String fullName );
	
	
}
