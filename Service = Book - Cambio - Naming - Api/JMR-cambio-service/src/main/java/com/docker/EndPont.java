package com.docker;

public class EndPont {
	
	public void name() {
		URL1();
		ApiDocs();
		api_gateway();
	}

	private void api_gateway() {
		System.out.println(" Usanso Rotas com API_GATEWAY URL1 \n"
				 + " http://localhost:8765/cambio-service/5/USD/BRL \n"
				 + " http://localhost:8765/book-service/1/BRL \n");
	}

	private void ApiDocs() {
		System.out.println(" Usanso os End Ponts URL ApiDocs \n"
				 + " Book Service\n\n"
				 + " http://localhost:8100/v3/api-docs\r\n"
				 + " http://localhost:8100/swagger-ui.html\r\n"
				 + " Cambio Service\n\n"
				 + " http://localhost:8000/v3/api-docs\r\n"
				 + " http://localhost:8000/swagger-ui.html");		
	}

	private void URL1() {
		System.out.println(" Usanso os End Ponts URL1 \n"
						 + " http://localhost:8000/cambio-service/5/USD/BRL \n");		
	}

}
