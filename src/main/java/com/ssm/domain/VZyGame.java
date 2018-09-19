package com.ssm.domain;

import java.io.Serializable;

/**
 * 乐园-游戏基础信息表
 * @author guozw
 *
 */
public class VZyGame implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9105689614774929232L;
	
	private Long id;
	private String spId;
	private String developId;
	private String name;
	private Integer type; // 1.互动秀 2.小游戏
	private Integer sortNum;
	private String appSecretKey; // 加密key
	private String descs; // 描述
	private String rankUrl; // 排行榜入口地址
	private String gameUrl; // 游戏入口地址
	private Long createTime;
	private String creator;
	private Long updateTime;
	private String updator;
	public String getAppSecretKey() {
		return appSecretKey;
	}
	public Long getCreateTime() {
		return createTime;
	}
	
	
	public String getCreator() {
		return creator;
	}
	public String getDescs() {
		return descs;
	}
	public String getDevelopId() {
		return developId;
	}
	public String getGameUrl() {
		return gameUrl;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRankUrl() {
		return rankUrl;
	}
	public Integer getSortNum() {
		return sortNum;
	}
	public String getSpId() {
		return spId;
	}
	public Integer getType() {
		return type;
	}
	public Long getUpdateTime() {
		return updateTime;
	}
	public String getUpdator() {
		return updator;
	}
	public void setAppSecretKey(String appSecretKey) {
		this.appSecretKey = appSecretKey;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public void setDescs(String descs) {
		this.descs = descs;
	}
	public void setDevelopId(String developId) {
		this.developId = developId;
	}
	public void setGameUrl(String gameUrl) {
		this.gameUrl = gameUrl;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRankUrl(String rankUrl) {
		this.rankUrl = rankUrl;
	}
	public void setSortNum(Integer sortNum) {
		this.sortNum = sortNum;
	}
	public void setSpId(String spId) {
		this.spId = spId;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}
	public void setUpdator(String updator) {
		this.updator = updator;
	}
}
