package pl.wpe.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Plik {
	
	@XmlElement
	private int wartosc;
	
	@XmlElement
	private String status="NIETKNIETY";

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getWartosc() {
		return wartosc;
	}

	public void setWartosc(int plik) {
		this.wartosc = plik;
	}
	
	public void podniesWersje() {
		System.out.println("Podnosze wersje z: " +wartosc);
		this.wartosc++;
	}
	
	public void przetworz() {
		this.status="PRZETWORZONY";
	}
}
