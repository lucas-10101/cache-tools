package lucas10101.contracts;

import java.util.Collection;

public interface DataAccessObject<T, ID> {

    Collection<T> list();

    T findById(ID key);

    T save(T entity);

    boolean removeById(ID key);
}
