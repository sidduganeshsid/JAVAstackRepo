package in.sag.sec5learnspringboot;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration(prefix="")
@Component
public class CurrencyServiceConfiguration {
	private String currency_url;
	private String currency_name;
	private String currency_key;
}
