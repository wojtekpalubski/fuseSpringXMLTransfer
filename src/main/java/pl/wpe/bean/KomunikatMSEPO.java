package pl.wpe.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class KomunikatMSEPO {
	
	@XmlElement
	private int wartosc;
	
	public KomunikatMSEPO() {
		
	}
	
	public KomunikatMSEPO(Plik plik) {
		this.wartosc=plik.getWartosc();
	}

	public int getWartosc() {
		return wartosc;
	}

	public void setWartosc(int wartosc) {
		this.wartosc = wartosc;
	}

}
