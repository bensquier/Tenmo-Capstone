package com.techelevator.tenmo.model;

import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Transfer {
	
	private int transferId;
	@NotNull
	private int typeId;
	@NotNull
	private int statusId;
	@NotNull
	private int accountFromId;
	@NotNull
	private int accountToId;
	@Min(value = 0)
	private BigDecimal amount;

	public Transfer(int typeId, int statusId, int accountFromId, int accountToId, BigDecimal amount) {
		this.typeId = typeId;
		this.statusId = statusId;
		this.accountFromId = accountFromId;
		this.accountToId = accountToId;
		this.amount = amount;
	}
	
	public Transfer() {}
	
	public int getTransferId() {
		return transferId;
	}
	public void setTransferId(int transferId) {
		this.transferId = transferId;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public int getAccountFromId() {
		return accountFromId;
	}
	public void setAccountFromId(int accountFromId) {
		this.accountFromId = accountFromId;
	}
	public int getAccountToId() {
		return accountToId;
	}
	public void setAccountToId(int accountToId) {
		this.accountToId = accountToId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	

}
