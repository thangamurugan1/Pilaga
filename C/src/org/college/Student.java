package org.college;
//Multilevel Inheritance
public class Student extends Hostel
{
	public void studentname() {
			System.out.println("Thangamurugan");
}
	public void studentdept() {
		// TODO Auto-generated method stub
		System.out.println("Ece");
	}
	public void studentid() {
		// TODO Auto-generated method stub
		System.out.println("13ec0282");
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.collegecode();
		s.collegename();
		s.collegerank();
		s.hostelname();
		s.deptname();
		s.studentdept();
		s.studentid();
		s.studentname();
	}
}
