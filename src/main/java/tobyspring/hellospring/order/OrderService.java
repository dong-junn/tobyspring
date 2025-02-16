package tobyspring.hellospring.order;

import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import java.math.BigDecimal;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository jpaOrderRepository;
    private final PlatformTransactionManager transactionManager;

    public OrderService(OrderRepository jpaOrderRepository, PlatformTransactionManager transactionManager) {
        this.jpaOrderRepository = jpaOrderRepository;
        this.transactionManager = transactionManager;
    }

    public Order createOrder(String no, BigDecimal total) {
        Order order = new Order(no, total);

        this.jpaOrderRepository.save(order);
        return order;
    }

    public List<Order> createOrders(List<OrderReq> reqs) {
        return new TransactionTemplate(transactionManager).execute(status ->
            reqs.stream().map(req -> createOrder(req.no(), req.total())).toList()
        );
    }
}
