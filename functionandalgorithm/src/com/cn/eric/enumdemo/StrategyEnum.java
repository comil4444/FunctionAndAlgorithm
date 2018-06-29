package com.cn.eric.enumdemo;

enum StrategyEnum {
	MONDAY(PayType.WEEKDAY),
	TUESDAY(PayType.WEEKDAY),
	WEDNSDAY(PayType.WEEKDAY),
	THURSDAY(PayType.WEEKDAY),
	FRIDAY(PayType.WEEKDAY),
	SATURDAY(PayType.WEEKEND),
	SUNDAY(PayType.WEEKEND);
	
	private PayType payType;
	
	StrategyEnum(PayType payType){
		this.payType = payType;
	}
	
	double pay(double workHours,double payRate){
		return this.payType.pay(workHours, payRate);
	}
	
	private enum PayType{
		WEEKDAY{

			@Override
			double payOverTime(double hours, double payRate) {
				return hours<=HOURS_PER_SHIFT?0:(hours-HOURS_PER_SHIFT)*payRate/2;
			}
			
		},
		WEEKEND{

			@Override
			double payOverTime(double hours, double payRate) {
				return hours*payRate/2;
			}
			
		};
		
		private static final int HOURS_PER_SHIFT = 8;
		
		abstract double payOverTime(double hours,double payRate);
		
		double pay(double workHours,double payRate){
			double basePay = workHours * payRate;
			return basePay+payOverTime(workHours,payRate);
		}
	}

}
