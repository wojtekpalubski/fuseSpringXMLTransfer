package pl.wpe.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import pl.wpe.bean.Nadawca;
import pl.wpe.bean.PrzesylkaEPO;

public class EPOProcesor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		Nadawca n=exchange.getIn().getBody(Nadawca.class);
		System.out.println("W zbiorze "+n.getZbior().getGuid()+" jest przesylek: "+n.getZbior().getPrzesylkaEPO().size());
		for (PrzesylkaEPO pe:n.getZbior().getPrzesylkaEPO()) {
			System.out.println("Przesylka: "+pe.getGuid());
		}
		
	}

}
