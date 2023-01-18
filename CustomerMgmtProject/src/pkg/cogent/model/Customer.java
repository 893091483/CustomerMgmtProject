package pkg.cogent.model;

public class Customer {
	private String cId;
	private String cName;
	private String cEmail;
	private String cDob;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String cId, String cName, String cEmail, String cDob) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cEmail = cEmail;
		this.cDob = cDob;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public String getcDob() {
		return cDob;
	}

	public void setcDob(String cDob) {
		this.cDob = cDob;
	}

}
