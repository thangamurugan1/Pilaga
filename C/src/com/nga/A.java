package com.nga;

 public class A implements Run2{
				public void danny() {
					System.out.println("Danny is a  hero...");

				}
				@Override
				public void add() {
				// TODO Auto-generated method stub
					System.out.println("Addition of A");
						
				}
				@Override
				public void subtract() {
				// TODO Auto-generated method stub
					System.out.println("Subtraction of A");
				}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A v = new A();
		v.add();
		v.danny();
		v.subtract();
		
		
		
	}

}
