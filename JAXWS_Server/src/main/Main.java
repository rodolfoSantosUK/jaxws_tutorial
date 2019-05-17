package main;

import javax.jws.*;
import javax.xml.*;
import javax.xml.ws.Endpoint;

import ws.DemoImpl;
import ws.ProdutoWSImpl;

public class Main {

	public static void main(String[] args) {
		
		try {

			Endpoint.publish("http://localhost:8065/ws/demo", 
					new DemoImpl());
			
			Endpoint.publish("http://localhost:8066/ws/produto", 
					new ProdutoWSImpl());
			
			System.out.println("Feito");
		} catch (Exception e) {
          
			System.out.println(e.getMessage());
		
		}

	}

}
