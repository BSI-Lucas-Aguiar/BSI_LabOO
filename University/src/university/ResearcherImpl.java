package university;


public class ResearcherImpl implements ResearcherMixin
{

	private String lattesCurriculum;
	
	public ResearcherImpl(String lattesCurriculum)
	{
		this.setLattesCurriculum(lattesCurriculum);
	}
	
	@Override
	public String getLattesCurriculum()
	{
		return this.lattesCurriculum;
	}
	
	@Override
	public final void setLattesCurriculum(String lattesCurriculum)
	{
		this.lattesCurriculum = lattesCurriculum;
	}
	
}
