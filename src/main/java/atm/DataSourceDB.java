package atm;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
@Component
@Primary
public class DataSourceDB implements DataSource, javax.activation.DataSource {

    /**
     * Simulate reading customer information from database
     */
    public Map<Integer,Customer> readCustomers() {
        Map<Integer,Customer> customers = new HashMap<>();

        customers.put(1,new Customer(1,"Peter",1234,1000));
        customers.put(2,new Customer(2,"Katherine",2345,2000));
        customers.put(3,new Customer(3,"Chris",3456,3000));

        return customers;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return null;
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        return null;
    }

    @Override
    public String getContentType() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
