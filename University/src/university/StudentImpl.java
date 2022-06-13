package university;


public class StudentImpl implements StudentMixin
{

	private String registrationNumber;
	
	public StudentImpl(String registrationNumber)
	{
		this.setRegistrationNumber(registrationNumber);
	}
	
	private void setRegistrationNumber(String registrationNumber)
	{
		if (registrationNumber == null || registrationNumber.trim().isEmpty())
			throw new IllegalArgumentException("Registration number is mandatory.");
		
		this.registrationNumber = registrationNumber;
	}
	
	@Override
	public String getRegistrationNumber()
	{
		return this.registrationNumber;
	}

}
