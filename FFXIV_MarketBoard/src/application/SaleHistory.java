package application;

import java.util.ArrayList;

public class SaleHistory {
	private int itemID;
	private int lastUploadTime;
	private ArrayList<SaleEntry> entries;
	private String dcName;
	
	public SaleHistory(int itemID, int lastUploadTime, ArrayList<SaleEntry> entries, String dcName) {
		super();
		this.itemID = itemID;
		this.lastUploadTime = lastUploadTime;
		this.entries = entries;
		this.dcName = dcName;
	}
	
	//Getter Setter
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public int getLastUploadTime() {
		return lastUploadTime;
	}
	public void setLastUploadTime(int lastUploadTime) {
		this.lastUploadTime = lastUploadTime;
	}
	public ArrayList<SaleEntry> getEntries() {
		return entries;
	}
	public void setEntries(ArrayList<SaleEntry> entries) {
		this.entries = entries;
	}
	public String getDcName() {
		return dcName;
	}
	public void setDcName(String dcName) {
		this.dcName = dcName;
	}	
}
