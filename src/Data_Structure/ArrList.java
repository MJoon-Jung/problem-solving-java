package Data_Structure;

import java.util.NoSuchElementException;

public class ArrList <E>{
	private E a[];
	private int size;
	public ArrList(){
		a = (E[]) new Object[1];
		size = 0;
	}
	public E peek(int k) {
		if(size == 0) {
			throw new NoSuchElementException();
		}
		return a[k];
	}
	public void insertSize(E newItem) {
		if(size == a.length) {
			resize((2*a.length));
		}
		a[size++] = newItem;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void insert(E newItem, int k) {
		if(size == a.length)
			resize(2*a.length);
		for(int i = size-1; i >= k+1; i--) {
			a[i+1] = a[i];
		}
		a[k] = newItem;
		size++;
	}
	private void resize(int newSize) {
		Object[] t= new Object[newSize];
		for(int i =0; i < size; i++) {
			t[i] = a[i];
		}
		a = (E[]) t;
	}
	public E delete(int k) {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		E item = a[k];
		for(int i = k; k <size; i++) {
			a[i] = a[i+1];
		}
		size--;
		if(size > 0 && size == a.length/4) {
			resize(a.length/2);
		}
		return item;
	}
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
}














