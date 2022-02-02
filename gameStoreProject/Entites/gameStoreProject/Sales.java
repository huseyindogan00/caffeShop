package gameStoreProject;

public class Sales {
	
	int saleId;
	String soldGame;
	String gamerWho;
	String campaign;
	int totalPayment;
	
	public Sales(int saleId, String soldGame, String gamerWho, String campaign, int totalPayment) {
 
		this.saleId = saleId;
		this.soldGame = soldGame; //satýlan oyun
		this.gamerWho = gamerWho; //alan oyuncu
		this.campaign = campaign; // kampanya
		this.totalPayment = totalPayment; //toplam tutar
	}

	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public String getSoldGame() {
		return soldGame;
	}

	public void setSoldGame(String soldGame) {
		this.soldGame = soldGame;
	}

	public String getGamerWho() {
		return gamerWho;
	}

	public void setGamerWho(String gamerWho) {
		this.gamerWho = gamerWho;
	}

	public String getCampaign() {
		return campaign;
	}

	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}

	public int getTotalPayment() {
		return totalPayment;
	}

	public void setTotalPayment(int totalPayment) {
		this.totalPayment = totalPayment;
	}
	
}
