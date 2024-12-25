package lucas10101.data;

import java.util.Collection;

import lucas10101.contracts.DataAccessObject;
import lucas10101.model.Product;

public class ProductDAO implements DataAccessObject<Product, Integer> {

    @Override
    public Collection<Product> list() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'list'");
    }

    @Override
    public Product findById(Integer key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Product save(Product entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public boolean removeById(Integer key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeById'");
    }

}
