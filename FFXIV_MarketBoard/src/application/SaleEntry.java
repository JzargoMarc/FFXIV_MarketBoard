package application;

public class SaleEntry {
	private boolean hq;
	private int pricePerUnit;
	private int quantity;
	private int timestamp;
	private String worldName;
	private int worldID;

	public SaleEntry(boolean hq, int pricePerUnit, int quantity, int timestamp, String worldName, int worldID) {
		super();
		this.hq = hq;
		this.pricePerUnit = pricePerUnit;
		this.quantity = quantity;
		this.timestamp = timestamp;
		this.worldName = worldName;
		this.worldID = worldID;
	}

	// Getter Setter
	public boolean isHq() {
		return hq;
	}

	public void setHq(boolean hq) {
		this.hq = hq;
	}

	public int getPricePerUnit() {
		return pricePerUnit;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}

	public String getWorldName() {
		return worldName;
	}

	public void setWorldName(String worldName) {
		this.worldName = worldName;
	}

	public int getWorldID() {
		return worldID;
	}

	public void setWorldID(int worldID) {
		this.worldID = worldID;
	}

	public void setPricePerUnit(int pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
}
