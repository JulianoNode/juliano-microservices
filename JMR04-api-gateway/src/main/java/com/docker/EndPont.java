package com.docker;

public class EndPont {
	
	public void name() {
		URL1();
	}

	private void URL1() {
		System.out.println(" Usanso os End Ponts com o eureca URL1 \n"
						 + "\t\t CAMBIO-SERVICE \n"
						 + " http://localhost:8765/CAMBIO-SERVICE/cambio-service/3/USD/BRL \n"
						 + " http://host.docker.internal:8765/CAMBIO-SERVICE/cambio-service/3/USD/BRL \n\n"
						 + "\t\t BOOK-SERVICE \n"
						 + " http://localhost:8765/BOOK-SERVICE/book-service/5/BRL \n"
						 + " http://host.docker.internal:8765/BOOK-SERVICE/book-service/3/BRL \n");		
	}

}
