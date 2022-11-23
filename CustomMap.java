package PracStrings;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class CustomMap<K, V> implements Map <K, V>{
	
	private Map<K, V> map;
	int count;
	
	CustomMap(Map<K, V> map) {
		this.map = map;
		this.count = 0;
	}

	@Override
	public int size() {
		return map.size();
	}

	@Override
	public boolean isEmpty() {
		return map.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		return map.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return map.containsValue(value);
	}

	@Override
	public V get(Object key) {
		return map.get(key);
	}

	@Override
	public V put(K key, V value) {
		count++;
		return map.put(key, value);
	}

	@Override
	public V remove(Object key) {
		return map.remove(key);
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		int initialSize = map.size();
		map.putAll(m);
		count += map.size() - initialSize;
	}

	@Override
	public void clear() {
		map.clear();
	}

	@Override
	public Set<K> keySet() {
		return map.keySet();
	}

	@Override
	public Collection<V> values() {
		return map.values();
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		return map.entrySet();
	}

	@Override
	public V putIfAbsent(K key, V value) {
		int initialSize = map.size();
		V v = map.putIfAbsent(key, value);
		count += map.size() - initialSize;
		return v;
	}
	
}
