package cars;

public class MotorCycle implements VehicleInterface{
	
	private String manufacturer;
	private String model;
	private String gasolineType;
	private String color;
	private float consumptionInTowns;
	private float consumptionOutOfTowns;
	private float consumptionBoth;
	private int ps;
	private int speed;
	private double price;
	
	public MotorCycle() {
		
	}
	
	@Override
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	@Override
	public String getManufacturer() {
		return this.manufacturer;
	}
	
	@Override
	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public void setGasolineType(String gasolineType) {
		this.gasolineType = gasolineType;
	}
	
	@Override
	public String getGasolineType() {
		return this.gasolineType;
	}
	
	@Override
	public String getModel() {
		return this.model;
	}
	
	@Override
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String getColor() {
		return this.color;
	}
	
	@Override
	public void setConsumptionInTowns(float consumptionInTowns) {
		this.consumptionInTowns = consumptionInTowns;
	}
	
	@Override
	public float getConsumptionInTowns() {
		return this.consumptionInTowns;
	}
	
	
	@Override
	public void setConsumptionOutOfTowns(float consumptionOutOfTowns) {
		this.consumptionOutOfTowns = consumptionOutOfTowns;
	}
	
	@Override
	public float getConsumptionOutOfTowns() {
		return this.consumptionOutOfTowns;
	}
	
	@Override
	public void setConsumptionBoth(float consumptionBoth) {
		this.consumptionBoth = consumptionBoth;
	}
	
	@Override
	public float getConsumptionBoth() {
		return this.consumptionBoth;
	}
	
	@Override
	public void setPs(int ps) {
		this.ps = ps;
	}
	
	@Override
	public int getPs() {
		return this.ps;
	}
	
	@Override
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	@Override
	public int getSpeed() {
		return this.speed;
	}
	
	@Override
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public double getPrice() {
		return this.price;
	}
}
