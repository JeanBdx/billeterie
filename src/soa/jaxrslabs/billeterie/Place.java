package soa.jaxrslabs.billeterie;
import javax.xml.bind.annotation.XmlRootElement;

public class Place {
	
	private int numero;
	private String escalier;
	private int rang;
	
	public Place() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param numero
	 * @param escalier
	 * @param rang
	 */
	public Place(int numero, String escalier, int rang) {
		super();
		this.numero = numero;
		this.escalier = escalier;
		this.rang = rang;
	}
	@Override
	public String toString() {
		return "Place [numero=" + numero + ", escalier=" + escalier + ", rang=" + rang + "]";
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getEscalier() {
		return escalier;
	}
	public void setEscalier(String escalier) {
		this.escalier = escalier;
	}
	public int getRang() {
		return rang;
	}
	public void setRang(int rang) {
		this.rang = rang;
	}
	
	
}
