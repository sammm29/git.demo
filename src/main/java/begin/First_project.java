package begin;

public class First_project {
public static void main(String [] args) {
	try {
		Class.forName("org.postgresql.Driver");
		System.out.print("Driver Class is Uploaded Successfully");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}
}
