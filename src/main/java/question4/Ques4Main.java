package question4;

import com.transaction.model.Address;
import com.transaction.model.Customer;
import dao.CustomerDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ques4Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("transaction.xml");
        CustomerDAO dao = (CustomerDAO) ctx.getBean("customerDAO");

        /*Using Platform Transaction*/
        UserServicePlatformTransaction platformTransaction = (UserServicePlatformTransaction) ctx.getBean(UserServicePlatformTransaction.class);
        platformTransaction.doInTransaction(dao, createDummyCustomer());


        /*Transaction Template*/
        UserService userService = ctx.getBean(UserService.class);
        userService.inTransactionWithReturn(dao, createDummyCustomer());
        userService.inTransactionWithoutReturn(dao, createDummyCustomer());
    }

    private static Customer createDummyCustomer() {
        Customer customer = new Customer();
        customer.setId(2);
        customer.setName("manisha");
        Address address = new Address();
        address.setId(222);
        address.setAddress("address2");
        address.setCountry("Japan");
        customer.setAddress(address);
        return customer;
    }
}