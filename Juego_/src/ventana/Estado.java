package ventana;

public enum Estado {
CM("completamente roto"),
R("roto"),
S("sano");
	private String abreviatura;
    Estado(String abreviatura){
    	this.abreviatura=abreviatura;
    }
    public String getAbreviatura(){
    	return abreviatura;
    }
}
