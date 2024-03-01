package com.docker;

public class URL_Teste {

	public void URL() {
		URL_Book();
		URL_Cambio();
	}

	public void URL_Cambio() {
		System.out.println("Url Cambio de Teste \n"
				+ "http://localhost:8000/cambio-service/3/USD/COP ");

	}

	public void URL_Book() {
		System.out.println("Url Book de Teste \n"
				+ "http://localhost:8100/book-service/3/BRL ");

	}

}
