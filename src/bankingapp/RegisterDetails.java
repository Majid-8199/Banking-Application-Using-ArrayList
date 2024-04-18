package bankingapp;

public class RegisterDetails {
	String email, password;
	String firstName, lastName;
	int age;
	long mobileNo, aadharNo;

	public RegisterDetails(String email, String password, String firstName, String lastName, int age, long mobileNo,
			long aadharNo) {
		super();
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.mobileNo = mobileNo;
		this.aadharNo = aadharNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
