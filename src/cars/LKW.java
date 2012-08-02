package cars;

public class LKW extends Car{
	private String hangerType;
	private int countofAxes;
	
	public LKW() {
		
	}
	
	public void setHangerType(String hangerType) {
		this.hangerType = hangerType;
	}
	
	public String getHangerType() {
		return this.hangerType;
	}
	
	public void setCountOfAxes(int countOfAxes) {
		this.countofAxes = countOfAxes;
	}
	
	public int getCountOfAxes() {
		return this.countofAxes;
	}

}
