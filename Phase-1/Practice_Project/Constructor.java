package com.Building_Blocks;

	//default constructor
		class EmpInfo{
			int id;
			String name;

		void display() {
			System.out.println(id+" "+name);
			}
		}
		//parameterized constructor
		class Std{
			int sid;
			String sname;

			Std(int s,String sn)
			{
			sid=s;
			sname=sn;
			}

			void displayp() {
			System.out.println(sid+" "+sname);
			}
		}

		public class Constructor {

		public static void main(String[] args) {

			EmpInfo emp1=new EmpInfo();
			EmpInfo emp2=new EmpInfo();

			emp1.display();
			emp2.display();
			
			Std std1=new Std(1,"Prasad");
			Std std2=new Std(2,"Sagar");
			std1.displayp();
			std2.displayp();

			}
		}


