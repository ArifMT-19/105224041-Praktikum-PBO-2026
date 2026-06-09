// SOLID - SRP: Class ini khusus simulasi simpan order
public class DatabaseOrderRepository implements OrderRepository {
    public void save(Order order) {
        System.out.println("Order disimpan ke database");
    }
}