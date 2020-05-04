package org.pom;

public class POMCLASS {
SearchPage search;
LoginPage login;
HotelSelect hotel;
CoustmerDetail customer;
public SearchPage getSearch() {
	return (search==null)?search=new SearchPage():search;
}
public LoginPage getLogin() {
	return (login==null)?login=new LoginPage():login;
}
public HotelSelect getHotel() {
	return (hotel==null)?hotel=new HotelSelect():hotel;
}
public CoustmerDetail getCustomer() {
	if(customer==null) {
		customer=new CoustmerDetail();
	}
	return customer;
}

}
