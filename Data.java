
public class Data {
	private String name, number, mailid;

	public Data() {
		super();
	}

	public Data(String name, String number, String mailid) {
		super();
		this.name = name;
		this.number = number;
		this.mailid = mailid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
}
