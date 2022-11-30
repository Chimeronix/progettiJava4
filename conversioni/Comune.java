package conversioni;

public class Comune {

	public String istat, nome, provincia, cap, catastale;
	
	public Comune() {
		
	}
	
	public Comune(String istat, String nome, String provincia, String cap, String catastale) {
		this.istat = istat;
		this.nome = nome;
		this.provincia = provincia;
		this.cap = cap;
		this.catastale = catastale;
	}

	public String getIstat() {
		return istat;
	}

	public void setIstat(String istat) {
		this.istat = istat;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getCatastale() {
		return catastale;
	}

	public void setCatastale(String catastale) {
		this.catastale = catastale;
	}
	
	
	
	
	
}
