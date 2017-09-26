package me.flyray.cms.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class CmsViewFavort implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 主键，自增
	 */
	private Long id;
	/**
	 * 用户编号
	 */
	private Long customerId;
	/**
	 * 观点编号
	 */
	private Long pointId;
	/**
	 * 1点赞2取消赞
	 */
	private Integer favortStatus;
	/**
	 * 创建时间
	 */
	private Timestamp createTime;
	/**
	 * 更新时间
	 */
	private Timestamp updateTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Long getPointId() {
		return pointId;
	}
	public void setPointId(Long pointId) {
		this.pointId = pointId;
	}
	public Integer getFavortStatus() {
		return favortStatus;
	}
	public void setFavortStatus(Integer favortStatus) {
		this.favortStatus = favortStatus;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "CmsViewFavort [id=" + id + ", customerId=" + customerId + ", pointId=" + pointId + ", favortStatus="
				+ favortStatus + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
}