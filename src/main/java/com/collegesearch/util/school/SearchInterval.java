package com.collegesearch.util.school;

public class SearchInterval {
		private float upperLimit;
		private float lowerLimit;
		
		public float getUpperLimit() {
			return upperLimit;
		}
		public void setUpperLimit(float upperLimit) {
			this.upperLimit = upperLimit;
		}
		public float getLowerLimit() {
			return lowerLimit;
		}
		public void setLowerLimit(float lowerLimit) {
			this.lowerLimit = lowerLimit;
		}
		

		
		// different contructor
		public SearchInterval(String intervalStr) {
			String a[] = intervalStr.split(":");
			this.upperLimit=Math.max(Float.parseFloat(a[0]), Float.parseFloat(a[1]));
			this.lowerLimit=Math.min(Float.parseFloat(a[0]), Float.parseFloat(a[1]));
		}
		public SearchInterval() {
			this.upperLimit=0;
			this.lowerLimit=0;
		}
		public SearchInterval(float num1, float num2) {
			this.upperLimit=Math.max(num1, num2);
			this.lowerLimit=Math.min(num1, num2);
		}
		
		// overload to int when the interval is int
		public int getIntUpperLimit() {
			return Math.round(upperLimit);
		}
		public int getIntLowerLimit() {
			return Math.round(lowerLimit);
		}
	}

