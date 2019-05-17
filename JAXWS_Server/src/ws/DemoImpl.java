package ws;

import javax.jws.WebService;

@WebService(endpointInterface="ws.Demo")
public class DemoImpl implements Demo {

	@Override
	public String exibeHelloWorld() {
		return "Hello World";
	}

	@Override
	public String exibeHi(String fullName ) {
		// TODO Auto-generated method stub
		return "Hi "  +  fullName;
	}

	
	
	
}
