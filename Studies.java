package abstraction;
 
abstract class School{
	abstract void takeAttendance(String name);
	void ringBell()
	{
		System.out.println("The bell is ringing");
	}
}
public class Studies extends School  {

	public static void main(String[] args) {
		 Studies std = new Studies();
		 std.takeAttendance("John");
		 std.ringBell();
		 
		
}
 @Override
	void takeAttendance(String name) {
              System.out.println("Attendance is taken for: "+name);		
	}
 
}
