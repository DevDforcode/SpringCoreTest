package test;

public class Tenant {
	
	String Tname;
	String phonenumber;
	public Tenant(String tname, String phonenumber) {
		super();
		Tname = tname;
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "Tenant [Tname=" + Tname + ", phonenumber=" + phonenumber + "]";
	}
	

}
