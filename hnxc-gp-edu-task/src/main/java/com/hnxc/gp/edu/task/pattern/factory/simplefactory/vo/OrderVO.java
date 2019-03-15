package com.hnxc.gp.edu.task.pattern.factory.simplefactory.vo;

import java.io.Serializable;
/**
 * 支付订单实体类
 * @author ywh
 * @since 2019-03-15
 * */
public class OrderVO implements Serializable{

	private String orderno;//订单号
	private String transtime;//交易时间
	private String amount;//交易金额
	private String acct;//对账时间
	private String paystyle;//支付方式：银联、支付宝、微信
	private String paydatetime;//支付时间
	private String stats;//支付状态 0未支付1支付中2支付完成3订单超时4订单不存在5订单取消6订单完成 
	
	
	public String getOrderno() {
		return orderno;
	}
	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}
	public String getTranstime() {
		return transtime;
	}
	public void setTranstime(String transtime) {
		this.transtime = transtime;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAcct() {
		return acct;
	}
	public void setAcct(String acct) {
		this.acct = acct;
	}
	public String getPaystyle() {
		return paystyle;
	}
	public void setPaystyle(String paystyle) {
		this.paystyle = paystyle;
	}
	public String getPaydatetime() {
		return paydatetime;
	}
	public void setPaydatetime(String paydatetime) {
		this.paydatetime = paydatetime;
	}
	public String getStats() {
		return stats;
	}
	public void setStats(String stats) {
		this.stats = stats;
	}
	@Override
	public String toString() {
		return "OrderVO [orderno=" + orderno + ", transtime=" + transtime + ", amount=" + amount + ", acct=" + acct
				+ ", paystyle=" + paystyle + ", paydatetime=" + paydatetime + ", stats=" + stats + "]";
	}
	
}
