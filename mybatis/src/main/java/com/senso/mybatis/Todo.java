package com.senso.mybatis;

import java.util.Date;

public class Todo {
	private int id;
	private String content;
	private boolean status;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Date getDeletedAt() {
		return deletedAt;
	}
	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}
	
	@Override
	public String toString() {
		return "Todo [id=" + id + ", content=" + content + ", status=" + status + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
		    + ", deletedAt=" + deletedAt + "]";
	}
}
