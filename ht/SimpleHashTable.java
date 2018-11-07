package ht;
/*
 * N00803604
 * Kevin Perez
 * 
 *  I am going to ignore any data that collides
 *  
 */

public class SimpleHashTable<K, V> 
{
	
	// instance vars:
	// create an array of SimpleEntry called hashtable
	public SimpleEntry<K,V>[] hashtable;
	// counter for collisions
	private int collisionNum;
	// counter for how many times you expanded capacity
	private int expandCount;
	// will need get methods for those counters
	private int numOfItems;
	
	

	
	// default constructor, instantiate the array to size 5
	public SimpleHashTable() 
	{
		// the syntax is similar to the one used in the Set lab
		hashtable = (SimpleEntry<K,V>[])(new Object[5]);
		
		
	}
	public SimpleHashTable(int initSize) 
	{
		// the syntax is similar to the one used in the Set lab
		hashtable = (SimpleEntry<K,V>[])(new Object[initSize]);
		
		
	}
	
	// call hashcode method of key, compress it, then store key, value at that position
	// count how many collisions you had, up to you if you want to overwrite or not
	// need to expandcapacity if needed
	public void put(K key, V value) 
	{
		if(getnumOfItems() == hashtable.length)
			reshash();
	
		hashtable[compress(key.hashCode())] = (SimpleEntry<K, V>) value;
		
		
		
			numOfItems++;
	}
	
	// return Value based on key or throw NoSuchElementException if it doesn't exist 
	public V get(K key) 
	{
		
		return (V) hashtable[compress(key.hashCode())];
		
	}
	
	public int compress(int hash){
		return hash%hashtable.length;
	}
	// this is the expandcapacity method
	// expand array and recompress the values to find new position
	private void reshash()
	{
	
		
		SimpleEntry<K,V>[] temp = (SimpleEntry<K,V>[])(new Object[hashtable.length*2]);
		for(int i=0; i<hashtable.length;i++){
			if(hashtable[i]!=null)
			temp[(hashtable[i].hashCode())%temp.length] = hashtable[i];
		}
		hashtable = temp;
		expandCount++;
	}
	
	
	
	public int getCollisions(){
		return collisionNum;
	}
	public int getExpandCount(){
		return expandCount;
	}
	public int getnumOfItems(){
		return numOfItems;
	}
	
	
	
	
	
	

}
