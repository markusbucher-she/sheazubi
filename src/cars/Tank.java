package cars;

public class Tank extends LKW{
	private String canon;
	private String machineGun;
	private String armor;
	
	public Tank() {
		
	}
	
	public void setCanon(String canon) {
		this.canon = canon;
	}
	
	public String getCanon() {
		return this.canon;
	}
	
	public void setMachineGun(String machineGun) {
		this.machineGun = machineGun;
	}
	
	public String getMachineGun() {
		return this.machineGun;
	}
	
	public void setArmor(String armor) {
		this.armor = armor;
	}
	
	public String getArmor() {
		return this.armor;
	}
}
