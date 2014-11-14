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

	public void add(){
		resize(a.length +1);
	}
    public void add(Object e){
		if(a[a.length-1] == null){
			Object[] list = new Object[a.length + 1];
			list = a;
			list[current] = e;
			current ++;
			a = list;
		}else{
			add();
			add(e);
		}
    }
	public void add(int index, Object o){
		if(a[a.length-1] == null){
			Object[] list = new Object[a.length + 1];
			for(int i = 0; i <index; i++){
				list[i] = a[i];
			}
			list[index] = o;
			for(int i=index +1; i<list.length; i++){
				list[i] = a[i];
			}
			a = list;
		}else{
			add();
			add(index,o); 
		}
	}

    public int size(){
		int s = 0;
		if(a.length <=10){
			for(int i =0; i <a.length; i++){
				if(a[i] == null){
					break;
				}
				s++;
			}
		}else{
			return a.length;
		}
		return s;
    }
    public void resize(int newCapacity){
		Object[] newArray = new Object[newCapacity];
		if(a.length <= newCapacity){
			for(int i = 0; i < a.length; i++){
				newArray[i] = a[i];
	    	}
		}else{
			for(int i =0; i<newCapacity; i++){
				newArray[i] = a[i];
			}
		}
		a = newArray;
    }
	public void clear(){
		Object[] newArray;
		if(a.length <=10){
			newArray = new Object[a.length];
		}else{
			newArray = new Object[10];
		}
		a = newArray;
		current = 0;
	}
	public Object get(int index){
		if(index < 0 || index >= size()){
			throw new IndexOutOfBoundsException();
		}else{
			return a[index];
		}
	}
	public Object set(int index, Object e){
		if (index < 0 || index >= size()){
			throw new IndexOutOfBoundsException(); 
		}else{
			Object replaced = a[index];
			a[index] = e;
			return replaced;
		}
	}    	
	public void remove(int index){
		Object hold = a[index];
		if(index < a.length){
			if(a.length <= 10){
				a[index] = null;
			}else{
				Object[] newArray = new Object[a.length -1];
				for(int i=0; i<index;i++){
					newArray[i] = a[i];
				}
				for(int i=index; i <newArray.length; i++){
					newArray[i] = a[i+1];
				}
				a = newArray;
			}
		}else{
			throw new IndexOutOfBoundsException();
		}	
	}
}
