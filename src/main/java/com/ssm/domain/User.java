package com.ssm.domain;

import java.io.Serializable;
import java.util.Date;


public class User implements Serializable {
	public String getParentMobileNum() {
		return parentMobileNum;
	}

	public void setParentMobileNum(String parentMobileNum) {
		this.parentMobileNum = parentMobileNum;
	}

    private Long id;

    private String userId;

    private String name;

    private String loginId;

    private String password;
    
    private Integer type;

    private String image;

    private String parentId;
    
    private String companyNumber;
    
    private String companyName;
    
    private Integer isAuthen;

    private String idcard;

    private String realName;
    private Integer isDelete;
    public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Date getMemberBeginTime() {
		return memberBeginTime;
	}

	public void setMemberBeginTime(Date memberBeginTime) {
		this.memberBeginTime = memberBeginTime;
	}

	public Date getMemberEndTime() {
		return memberEndTime;
	}

	public void setMemberEndTime(Date memberEndTime) {
		this.memberEndTime = memberEndTime;
	}

    private Date createTime;
    private Date updateTime;
    
    //会员
    private String level;
    private Date memberBeginTime;
    private Date memberEndTime;
    
    //用户上传的产品数量
    private Integer itemCount;
    //下载二维码图片
    private String downloadLink;
    
    private String companyInfo;
    
    private String regionName;
    
    private String  regionId2;
    
    private String regionName2;
    
    private String regionId1;
    
    private String regionName1;
    /**
     * 交易次数
     */
    private int  totalTrade;
    /**
     * 剩余点击次数
     */
    private long lestNum=0;
    //易物师姓名
    private String parentName;
    //易物师真实姓名
    private String parentRealName;
    
    public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getParentRealName() {
		return parentRealName;
	}

	public void setParentRealName(String parentRealName) {
		this.parentRealName = parentRealName;
	}

	public int getTotalTrade() {
		return totalTrade;
	}

	public void setTotalTrade(int totalTrade) {
		this.totalTrade = totalTrade;
	}

	public String getRegionId2() {
		return regionId2;
	}

	public void setRegionId2(String regionId2) {
		this.regionId2 = regionId2;
	}

	public String getRegionName2() {
		return regionName2;
	}

	public void setRegionName2(String regionName2) {
		this.regionName2 = regionName2;
	}

	public String getRegionId1() {
		return regionId1;
	}

	public void setRegionId1(String regionId1) {
		this.regionId1 = regionId1;
	}

	public String getRegionName1() {
		return regionName1;
	}

	public void setRegionName1(String regionName1) {
		this.regionName1 = regionName1;
	}

	public String getDownloadLink() {
		return downloadLink;
	}

	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}

	private String qq;
    
    private String email;
    
    private String qrcodeUrl;
    
    private String regionId;
    
    private String birthday;
    
    public Integer gender;
    
    public String userGender;
    //易物师傅的电话
    public String parentMobileNum;
    
    public String getQrcodeUrl() {
		return qrcodeUrl;
	}

	public void setQrcodeUrl(String qrcodeUrl) {
		this.qrcodeUrl = qrcodeUrl;
	}

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}
	

	private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public Integer getIsAuthen() {
        return isAuthen;
    }

    public void setIsAuthen(Integer isAuthen) {
        this.isAuthen = isAuthen;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

	public Integer getItemCount() {
		return itemCount;
	}

	public void setItemCount(Integer itemCount) {
		this.itemCount = itemCount;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyInfo() {
		return companyInfo;
	}

	public void setCompanyInfo(String companyInfo) {
		this.companyInfo = companyInfo;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public long getLestNum() {
		return lestNum;
	}

	public void setLestNum(long lestNum) {
		this.lestNum = lestNum;
	}

}