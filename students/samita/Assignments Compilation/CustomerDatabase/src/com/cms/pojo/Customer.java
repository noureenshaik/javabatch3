package com.cms.pojo;

public class Customer {
		
		private int cNo;
		private String cName;
		private String cAdd;
		public Customer(int cNo, String cName, String cAdd) {
			super();
			this.cNo = cNo;
			this.cName = cName;
			this.cAdd = cAdd;
		}
		public int getcNo() {
			return cNo;
		}
		public void setcNo(int cNo) {
			this.cNo = cNo;
		}
		public String getcName() {
			return cName;
		}
		public void setcName(String cName) {
			this.cName = cName;
		}
		public String getcAdd() {
			return cAdd;
		}
		public void setcAdd(String cAdd) {
			this.cAdd = cAdd;
		}
		

	}

