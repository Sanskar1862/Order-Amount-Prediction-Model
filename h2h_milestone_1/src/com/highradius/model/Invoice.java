package com.highradius.model;

public class Invoice {
	long id;
	long customerId;
	int salseOrg;
	String distributionChannel;
	int companyCode;
	String orderCreationDate;
	double orderAmount;
	String orderCurrency;
	long customerNumber;
	double amountInUsd;
	public Invoice(long id, long customerId, int salseOrg, String distributionChannel, int companyCode,
			String orderCreationDate, double orderAmount, String orderCurrency, long customerNumber,
			double amountInUsd) {
		this.id = id;
		this.customerId = customerId;
		this.salseOrg = salseOrg;
		this.distributionChannel = distributionChannel;
		this.companyCode = companyCode;
		this.orderCreationDate = orderCreationDate;
		this.orderAmount = orderAmount;
		this.orderCurrency = orderCurrency;
		this.customerNumber = customerNumber;
		this.amountInUsd = amountInUsd;
	}
	public long getid() {
		return id;
	}
	public void setid(long id) {
		this.id = id;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public int getSalseOrg() {
		return salseOrg;
	}
	public void setSalseOrg(int salseOrg) {
		this.salseOrg = salseOrg;
	}
	public String getDistributionChannel() {
		return distributionChannel;
	}
	public void setDistributionChannel(String distributionChannel) {
		this.distributionChannel = distributionChannel;
	}
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public String getOrderCreationDate() {
		return orderCreationDate;
	}
	public void setOrderCreationDate(String orderCreationDate) {
		this.orderCreationDate = orderCreationDate;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getOrderCurrency() {
		return orderCurrency;
	}
	public void setOrderCurrency(String orderCurrency) {
		this.orderCurrency = orderCurrency;
	}
	public long getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(long customerNumber) {
		this.customerNumber = customerNumber;
	}
	public double getAmountInUsd() {
		return amountInUsd;
	}
	public void setAmountInUsd(double amountInUsd) {
		this.amountInUsd = amountInUsd;
	}
	
	
}
