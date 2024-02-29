import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SafeSet<T> implements Set<T> {
    @Override
    public String toString() {
        return set.toString();
    }

    private final Set<T> set = new HashSet<>();

    @Override
    public synchronized int size() {
        return set.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public synchronized boolean contains(Object o) {
        return set.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public synchronized boolean add(T t) {
        return set.add(t);
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    // Другие методы интерфейса Set также должны быть реализованы с использованием synchronized
    // Например, remove, clear, iterator и т. д.
}