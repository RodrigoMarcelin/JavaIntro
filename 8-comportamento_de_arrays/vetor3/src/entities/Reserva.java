package entities;

public class Reserva {
	private String name, email;
	private int Room;
	
	public Reserva(String name, String email, int room) {
		this.name = name;
		this.email = email;
		Room = room;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRoom() {
		return Room;
	}
	public void setRoom(int room) {
		Room = room;
	}
	
	

}
