/**
 * 
 * @author thinkpad
 * ְλ��Ƹģ��
 */
public class jobModel {

	//��λ
	private String jobName;
	//н��
	private float salary;
	//��˾��
	private String compName;
	public jobModel(String jobName, float salary, String compName) {
		super();
		this.jobName = jobName;
		this.salary = salary;
		this.compName = compName;
	}
	public jobModel() {
		super();
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	@Override
	public String toString() {
		return "jobModel [jobName=" + jobName + ", salary=" + salary + ", compName=" + compName + "]";
	}
	
}
