package net.sas.model.bo;

public enum Color {
	
	BLACK("Noir"),
	WHITE("Blanc"),
	BLUE("Bleu"),
	GREY("Gris"),
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
