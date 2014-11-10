public class superArray{
	private Object[] a;
    private int current;
    public superArray(){
		a = new Object[10];
   	}
    public superArray(int size){
		a = new Object[size];
    }
    public String toString(){
		String str = "[";
		for(int i = 0; i<a.length; i++){
	    	str += " " + a[i];
		}
		str += "]";
		return str;
    }
    public void add(Object e){
		Object[] list = new Object[a.length + 1];
		list = a;
		list[current] = e;
		current ++;
		a = list;
    }
    public int size(){
		return a.length;
    }
    public void resize(int newCapacity){
		Object[] newArray = new Object[newCapacity];
		for(int i = 0; i < a.length; i++){
			newArray[i] = a[i];
	    }
		a = newArray;
    }
	public void clear(){
		for(int i=0; i<a.length; i++){
			a[i] = null;
		}
	}
	public Object get(int index){
		if(index < 0 || index >= size()){
			System.out.println("Error: Index out of range");
			return null;
		}else{
			return a[index];
		}
	}
	public Object set(int index, Object e){
		Object replaced = a[index];
		a[index] = e;
		if (index < 0 || index >= size()){
			System.out.println("Error: Index out of range");
			return null;
		}else{
			return replaced;
		}
	}    	
	public void add(int index, Object o){
		Object[] list = new Object[a.length + 1];
		for(int i = 0; i <list.length;i++){
			if(i<index){
				list[i] = a[i];
			}else if(i == index){
				list[i] = o;
			}else if(i > index){
				if(i < a.length){
					list[i] = a[i+1];
				}else{}
			}
		a = list;
		}
	}
	public Object remove(int index){
		if(index < 0 || index >= size()){
			System.out.println("Error: Index out of range");
			return null;
		}else{
			Object removed = a[index];
			Object[] list = new Object[a.length -1];
			for(int i=0; i<a.length;i++){
				if(i < index){
					list[i] = a[i];
				}else if(i >index){
					list[i-1] = a[i];
				}
			}
			return removed;
		}
	}
}
