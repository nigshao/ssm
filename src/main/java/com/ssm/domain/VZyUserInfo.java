package com.ssm.domain;

import java.io.Serializable;

public class VZyUserInfo implements Serializable {
    private static final long serialVersionUID = -5318183447498837030L;
    private long id;
    private String account;
    private String password;
    private String password2; // md5加密后的密码
    private String nickName;
    private int score;
    private String mobile;
    private int sex;
    private String headPortrait;
    private long provinceId;
    private long cityId;
    private long countyId;
    private long schoolId;
    private long gradeId;
    private long registerTime;
    private long endTime;
    private int type;
    private String realName;
    private int status;
    private int registerType;
    private String inviteCode;
    private String deviceType;
    private int friendType;
    private String unionId;
    private int areaCode;
    private String mail;
    private String userId; // 新的uesrId
    
    public VZyUserInfo(){
    	mail = "";
    }
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getHeadPortrait() {
		return headPortrait;
	}
	public void setHeadPortrait(String headPortrait) {
		if(headPortrait != null && !"".equals(headPortrait)){
			if(headPortrait.indexOf("head_photo") == -1) {
				headPortrait = "head_photo/" + headPortrait;
			}
		}
		this.headPortrait = headPortrait;
	}
	public long getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(long provinceId) {
		this.provinceId = provinceId;
	}
	public long getCityId() {
		return cityId;
	}
	public void setCityId(long cityId) {
		this.cityId = cityId;
	}
	public long getCountyId() {
		return countyId;
	}
	public void setCountyId(long countyId) {
		this.countyId = countyId;
	}
	public long getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(long schoolId) {
		this.schoolId = schoolId;
	}
	public long getGradeId() {
		return gradeId;
	}
	public void setGradeId(long gradeId) {
		this.gradeId = gradeId;
	}
	public long getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(long registerTime) {
		this.registerTime = registerTime;
	}
	public long getEndTime() {
		return endTime;
	}
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getRegisterType() {
		return registerType;
	}
	public void setRegisterType(int registerType) {
		this.registerType = registerType;
	}
	public String getInviteCode() {
		return inviteCode;
	}
	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public int getFriendType() {
		return friendType;
	}
	public void setFriendType(int friendType) {
		this.friendType = friendType;
	}
	public String getUnionId() {
		return unionId;
	}
	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
    public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }
    
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	@Override
	public String toString() {
		return "VZyUserInfo{" +
				"id=" + id +
				", account='" + account + '\'' +
				", password='" + password + '\'' +
				", password2='" + password2 + '\'' +
				", nickName='" + nickName + '\'' +
				", score=" + score +
				", mobile='" + mobile + '\'' +
				", sex=" + sex +
				", headPortrait='" + headPortrait + '\'' +
				", provinceId=" + provinceId +
				", cityId=" + cityId +
				", countyId=" + countyId +
				", schoolId=" + schoolId +
				", gradeId=" + gradeId +
				", registerTime=" + registerTime +
				", endTime=" + endTime +
				", type=" + type +
				", realName='" + realName + '\'' +
				", status=" + status +
				", registerType=" + registerType +
				", inviteCode='" + inviteCode + '\'' +
				", deviceType='" + deviceType + '\'' +
				", friendType=" + friendType +
				", unionId='" + unionId + '\'' +
				", areaCode=" + areaCode +
				", mail='" + mail + '\'' +
				", userId='" + userId + '\'' +
				'}';
	}
}
