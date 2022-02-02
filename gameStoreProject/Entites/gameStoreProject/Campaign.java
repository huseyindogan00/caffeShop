package gameStoreProject;

public class Campaign {
	int campaignId;
	double discount;
	String campaignDuration; 
	
	public Campaign(int campaignId, double discount, String campaignDuration) { 
		this.campaignId = campaignId;
		this.discount = discount;
		this.campaignDuration = campaignDuration;
	}
	public int getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getCampaignDuration() {
		return campaignDuration;
	}
	public void setCampaignDuration(String campaignDuration) {
		this.campaignDuration = campaignDuration;
	}
	
}
