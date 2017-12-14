package pl.wpe.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import pl.wpe.bean.KomunikatMSEPO;
import pl.wpe.bean.Plik;

public class Plik2KomunikatMSEPOProcesor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		Plik p=exchange.getIn().getBody(Plik.class);
		KomunikatMSEPO k = new KomunikatMSEPO(p);
		exchange.getIn().setBody(k);
        System.out.println("Zwrocono komunikat MSEPO: "+(k.getWartosc()));
		
	}

}
