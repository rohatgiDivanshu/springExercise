package question4;

import com.transaction.model.Customer;
import com.transaction.model.User;
import dao.CustomerDAO;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class UserService {
    private TransactionTemplate transactionTemplate;

    public UserService(PlatformTransactionManager platformTransactionManager) {
        this.transactionTemplate = new TransactionTemplate(platformTransactionManager);
        transactionTemplate.setIsolationLevel(TransactionDefinition.ISOLATION_READ_UNCOMMITTED);
    }

    public User inTransactionWithReturn(CustomerDAO customerDAO, Customer customer) {
        return transactionTemplate.execute(new TransactionCallback<User>() {
            @Override
            public User doInTransaction(TransactionStatus status) {
                customerDAO.create(customer);
                return null;
            }
        });
    }


    public void inTransactionWithoutReturn(CustomerDAO customerDAO, Customer customer) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                customerDAO.create(customer);
            }
        });
    }
}