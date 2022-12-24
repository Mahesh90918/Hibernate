package coupling;

public class Address {
	int pincode;
	String location;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", location=" + location + "]";
	}

}
