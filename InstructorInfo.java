package intoOne;

public class InstructorInfo {

	private String name;
	private long id;
	private String  branch ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public InstructorInfo(String name, long id, String branch) {
		super();
		this.name = name;
		this.id = id;
		this.branch = branch;
	}
	
	
	
}
