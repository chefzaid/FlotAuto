package net.sas.model.bo;

public enum Color {
	
	BLACK("Noir"),
	BLUE("Bleu"),
	WHITE("Blanc"),
	RED("Rouge"),
	GREEN("Vert"),
	YELLOW("Jaune");
	
	private String status;
	
	private Color(String status){
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
