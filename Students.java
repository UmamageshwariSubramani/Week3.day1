package Week3.day1;

public class Students {

	public void getStudentInfo() {
		
	}
	public void getStudentInfo(int studentid) {
		System.out.println("Entering id:"+" "+studentid);
		
	}
	
   public void getStudentInfo(int studentid, String name) {
	   System.out.println("Entering id:"+" "+studentid+" "+" student name is:"+" "+name);
		
	} 
   
   public void getStudentInfo(String email, long phonenumber) {
	   System.out.println("Entering email id:"+""+email+" "+"phone number is: "+" "+phonenumber);
		
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students details=new Students();
		details.getStudentInfo(123456);
		details.getStudentInfo(123456, "karmugilen");
		details.getStudentInfo("uma.s@gmail.com", 9094203239L);

	}

}
