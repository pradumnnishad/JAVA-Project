package jspider;

public class Ticket implements MovieTicket {
	
	private int availableTicket;
	private boolean ticket=true;
	
	public Ticket(int availableTicket) {
		super();
		this.availableTicket = availableTicket;
	}
	@Override
	public void bookTicket(int a) {
		if(a<=availableTicket && ticket==true) {
			System.out.println(a+" ticket booked");
			availableTicket-=a;
			System.out.println("**********  Hurray...!!!!  **********");
			if(availableTicket==0) {
				ticket=false;
			}
		}
		else {
			try {
				throw new SeatFullException("Seat Full");
			}
			catch(SeatFullException s) {
				System.out.println(s.toString());
			}
		}
	}

	@Override
	public void cancelTicket(int a) {
		availableTicket+=a;	
	}

	@Override
	public int displayTicket() {
//		return availableTicket;
		if(ticket==true) {
		return availableTicket;
		}
		else {
			return 0;
		}
	}

	@Override
	public String displayErrorMessage() {
		
		return "No ticket";
	}

}
