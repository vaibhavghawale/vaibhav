package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
	public class Account  {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int accno;
		private String name;
		private int balance;




		public int getAccno() {
			return accno;
		}


		public void setAccno(int accno) {
			this.accno = accno;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getBalance() {
			return balance;
		}


		public void setBalance(int balance) {
			this.balance = balance;
		}



		@Override
		public String toString() {
			return "Account [accno=" + accno + ", name=" + name + ", balance="
					+ balance + "]";
		}

	}

