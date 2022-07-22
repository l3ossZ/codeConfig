package atm;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.Map;

public interface DataSource {
    Map<Integer,Customer> readCustomers();
}


