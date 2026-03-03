package KTDGSS16;

import java.util.*;

public class ProductRepository implements IRepository<Product> {
    private List<Product> list = new ArrayList<>();
    private Map<String, Product> map = new HashMap<>();
    @Override
    public boolean add(Product item) {
        if (item == null || map.containsKey(item.getId())) return false;
        list.add(item);
        map.put(item.getId(), item);
        return true;
    }
    @Override
    public boolean removeById(String id) {
        if (id == null || !map.containsKey(id)) return false;
        Product p = map.get(id);
        list.remove(p);
        map.remove(id);
        return true;
    }
    @Override
    public Product findById(String id) {
        return map.get(id);
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(list);
    }
    public void sortByPrice() {
        list.sort(Comparator.comparingDouble(Product::getPrice));
    }
    public Map<String, Integer> getStatistics() {
        Map<String, Integer> stats = new HashMap<>();
        int electronicCount = 0;
        int foodCount = 0;
        for (Product p : list) {
            if (p instanceof ElectronicProduct) electronicCount++;
            else if (p instanceof FoodProduct) foodCount++;
        }
        stats.put("Electronic", electronicCount);
        stats.put("Food", foodCount);
        return stats;
    }
}