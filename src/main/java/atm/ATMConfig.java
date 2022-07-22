package atm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.activation.DataSource;
@Configuration
public class ATMConfig {

    @Bean
    public DataSource dataSource() {
        return new DataSourceDB();
    }
    @Bean
    public Bank bank() {
        return new Bank("My Bank", (atm.DataSource) dataSource());
    }
    @Bean
    public ATM atm() {
        return new ATM(bank());
    }
    @Bean
    public AtmUI atmUI() {
        return new AtmUI(atm());
    }
}
