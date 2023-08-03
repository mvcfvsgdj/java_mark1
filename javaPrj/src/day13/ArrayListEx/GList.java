package day13.ArrayListEx;

import java_day12.Score;

public class GList<T> {
	
	private Object[] nums;
	private int current;
	 	
	
	
	public GList() {		 
		nums = new Object[3];
		current=0;
	}
	
	public void add(T obj) {
		nums[current] = obj;
		current++;
		
	}
	
	public void clear(){
		//current 초기화
		current=0;
		// nums= new int[3];		
	}
	
	public int size()
	{
		return current;
	}
	
	public T get(int index)    { 
		
		return (T) nums[index];
	
	}
	public static void main(String[] args) {
		
	GList<Score> list =new GList();
		
		
		list.add(new Score("가나다", 100, 99));
		list.add(new Score("아자카", 99, 100));
		list.add(new Score("마바사", 20, 40));
		
		for(int i=0 ; i<list.size();i++) {
			System.out.println(list.get(i));
			
		}
		
		Score score=list.get(0);
		String name =score.getName();
		System.out.println(name);
	}

}
