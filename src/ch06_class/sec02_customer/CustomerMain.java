package ch06_class.sec02_customer;

public class CustomerMain {

	public static void main(String[] args) {
		Customer james = new Customer();  // 왜 new Cutomer(); 이렇게만 하면 오류가 나는가. 생성자중에 빈칸이 없기 때문에! 
		james.setCid(1); james.setName("제임스"); james.setAge(27); james.setAdult(true);
		
		Customer maria = new Customer(2, "마리아", 23, true);
		
		Customer brain = new Customer(3, "브라이언", 17);
		
		System.out.println(james); System.out.println(maria); System.out.println(brain);

		
	}

}
