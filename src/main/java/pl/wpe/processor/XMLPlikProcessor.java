package pl.wpe.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import pl.wpe.bean.Plik;

public class 	XMLPlikProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		Plik p=exchange.getIn().getBody(Plik.class);
		p.podniesWersje();
		p.przetworz();
		exchange.getIn().setBody(p);
        System.out.println("Przetworzono plik: "+(p.getWartosc()));
	}

}
