public class Testcase{
	public static void main(String[] args) {
		SequentialSearchST<String, Integer> obj = new SequentialSearchST<String, Integer>();
		obj.put("e",9);
		obj.put("f",2);
		obj.put("s",20);
		obj.put("t",3);

		obj.delete("s");
		System.out.println(obj.keys());

		 
        
        System.out.println(obj.isEmpty());
        System.out.println(obj.isEmpty());


        System.out.println(obj.size());



	}
}