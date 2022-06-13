package university;


public class TeacherImpl implements TeacherMixin
{
	private String degree;
	
	public TeacherImpl(String degree)
	{
		this.setDegree(degree);
	}

	@Override
	public String getDegree()
	{
		return this.degree;
	}

	@Override
	public final void setDegree(String degree)
	{
		this.degree = degree;
	}

}
