package cars;

public interface VehicleInterface {
	
	public void setManufacturer(String manufacturer);
	public String getManufacturer();
	
	public void setModel(String model);
	public String getModel();
	
	public void setGasolineType(String gasolineType);
	public String getGasolineType();
	
	public void setColor(String color);
	public String getColor();
	
	public void setConsumptionInTowns(float consumptionInTowns);
	public float getConsumptionInTowns();
	
	public void setConsumptionOutOfTowns(float consumptionsOutOfTown);
	public float getConsumptionOutOfTowns();
	
	public void setConsumptionBoth(float consumptionBoth);
	public float getConsumptionBoth();
	
	public void setPs(int ps);
	public int getPs();
	
	public void setSpeed(int speed);
	public int getSpeed();
	
	public void setPrice(long price);
	public long getPrice();
}
