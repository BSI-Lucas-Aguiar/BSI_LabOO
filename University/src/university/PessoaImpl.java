package university;


public class PessoaImpl implements Person, Teacher, Student, Researcher
{

	private String name;
	private String email;
	
	//roles (possíveis papéis desempenhados pela pessoa)
	private TeacherMixin teacher;
	private ResearcherMixin researcher;
	private StudentMixin student;
	
	public PessoaImpl(String name, String email)
	{
		this.teacher = null;
		this.researcher = null;
		this.student = null;
		this.setName(name);
		this.setEmail(email);
	}
	
	@Override
	public String getName()
	{
		return this.name;
	}

	@Override
	public final void setName(String name)
	{
		if (name == null || name.trim().isEmpty())
			throw new IllegalArgumentException("Name is mandatory.");
		
		this.name = name;
	}

	@Override
	public String getEmail()
	{
		return this.email;
	}

	@Override
	public final void setEmail(String email)
	{
		this.email = email;
	}
	
	public boolean isTeacher()
	{
		return this.teacher != null;
	}
	
	public void beTeacher(String degree)
	{
		if (this.isTeacher())
			throw new IllegalStateException("I am already a teacher.");
		
		this.teacher = new TeacherImpl(degree); 
	}
	
	@Override
	public String getDegree()
	{
		if (!this.isTeacher())
			throw new IllegalStateException("I am not a teacher.");
		
		return this.teacher.getDegree();
	}

	@Override
	public void setDegree(String degree)
	{
		if (!this.isTeacher())
			throw new IllegalStateException("I am not a teacher.");
		
		this.teacher.setDegree(degree);

	}

	public boolean isStudent()
	{
		return this.student != null;
	}
	
	public void beStudent(String registrationNumber)
	{
		if (this.isStudent())
			throw new IllegalStateException("I am already a student.");
		
		this.student = new StudentImpl(registrationNumber);
	}
	
	@Override
	public String getRegistrationNumber()
	{
		if (!this.isStudent())
			throw new IllegalStateException("I am not a student.");
		
		return this.student.getRegistrationNumber();
	}

	public boolean isResearcher()
	{
		return this.researcher != null;
	}
	
	public void beResearch(String lattesCurriculum)
	{
		if (this.isResearcher())
			throw new IllegalStateException("I am already a research.");
		
		this.researcher = new ResearcherImpl(lattesCurriculum); 
	}
	
	@Override
	public String getLattesCurriculum()
	{
		if (!this.isResearcher())
			throw new IllegalStateException("I am not a researcher.");
		
		return this.researcher.getLattesCurriculum();
	}

	@Override
	public void setLattesCurriculum(String lattesCurriculum)
	{
		if (!this.isResearcher())
			throw new IllegalStateException("I am not a researcher.");
		
		this.researcher.setLattesCurriculum(lattesCurriculum);
	}

}
