// SOLID - DIP: Bergantung ke interface, bukan class langsung
public class OrderService {
    OrderRepository orderRepository;
    PaymentMethod paymentMethod;
    Notifier notifier;

    public OrderService(OrderRepository orderRepository, PaymentMethod paymentMethod, Notifier notifier) {
        this.orderRepository = orderRepository;
        this.paymentMethod = paymentMethod;
        this.notifier = notifier;
    }

    // SOLID - SRP: Method ini hanya mengatur proses order
    public void processOrder(Order order) {
        System.out.println("Memproses order");
    }
}