package com.kprit.tns.backend.encapsulation;

public class DemoStudent {

		    private int sid;
		    private String sname;
		     
		    public int getSid() {
				return sid;
			}


			public void setSid(int sid) {
				this.sid = sid;
			}


			public String getSname() {
				return sname;
			}


			public void setSname(String sname) {
				this.sname = sname;
			}


			public void display() {
		    	System.out.println("The student details are:"+sid +sname);
		    }
			public static void main(String[] args) {
		       
				DemoStudent obj=new DemoStudent();
				obj.setSid(764);
				obj.setSname("Shiva");
				System.out.println(obj.getSid());
				System.out.println(obj.getSname());
				

			}

		


	}


