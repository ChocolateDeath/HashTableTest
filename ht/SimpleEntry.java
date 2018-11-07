package ht;
/*
 * N00803604
 * Kevin Perez
 */
import java.util.Map;

public class SimpleEntry<K, V> implements Map.Entry<K, V> 
{
	
	// declare two instance vars:
	// key of type K
	private K key;
	// value of type V
	private V value;
	
	
	// parameterized constructor, you know what to do
	public SimpleEntry(K key, V value) 
	{
		this.key = key;
		this.value = value;
	}
	
	@Override
	public K getKey() 
	{
		return key;
	}
	
	@Override
	public V getValue() 
	{
		return value;
	}
	
	// this must set the value to newValue but return the old value
	@Override
	public V setValue(V newValue) 
	{
		V oldValue = getValue();
		value = newValue;
		return oldValue;
	}

	
}