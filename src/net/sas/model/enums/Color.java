package net.sas.model.enums;

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
