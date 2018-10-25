package web.Controller;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

    private List owners = new ArrayList();

    protected Product createProduct(String owner, int number) {
        return new IDCard(owner, number);
    }

    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    @Override
    protected <T> Product parse(T entity) {
        return null;
    }

    @Override
    protected void validate(Product product) {
        
    }

    public List getOwners() {
        return owners;
    }
}
