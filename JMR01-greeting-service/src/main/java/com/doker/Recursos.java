package com.doker;

public class Recursos {
	
	public void links() {
		//URL1();
		//URL2();	
		URL3();
	}
	
	public void URL1() {		
		System.out.println("\n\t *Links para teste URL1()*\n\n"
						   +"http://localhost:8888/application-dev/default \n"
						   +"http://localhost:8888/application-perf/default \n"
						   +"http://localhost:8888/application-prod/default \n"
						   +"http://localhost:8888/application-qa/default \n");		
	}
	
	public void URL2() {		
		System.out.println("\n\t *Links para teste URL2()*\n\n"
						   +"http://localhost:8888/greeting-service/default \n"
						   +"http://localhost:8888/greeting-service/dev \n"
						   +"http://localhost:8888/greeting-service/perf \n"
						   +"http://localhost:8888/greeting-service/prod \n"
						   +"http://localhost:8888/greeting-service/qa \n");		
	}
	public void URL3() {		
		System.out.println("\n\t *Links para teste URL3()*\n\n"
						   +"http://localhost:8080/greeting \n"						  
						   +"http://localhost:8080/greeting?name=Juliano%20Test \n"
						   +"http://localhost:8080/greeting?name=Juliano \n"
						   +"http://localhost:8888/greeting-service/dev \n"
						   +"http://localhost:8888/greeting-service/qa \n");		
	}

}
