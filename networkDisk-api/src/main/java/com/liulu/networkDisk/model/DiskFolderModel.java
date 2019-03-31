package com.liulu.networkDisk.model;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 文件夹管理
 */
@Component
public class DiskFolderModel {

    /**
     * 用户id
     */
    @Id
    private String userDirId;

    /**
     * 文件夹名称
     */
    private String dirName;

    /**
     * 父节点id
     */
    private String parentId;

    /**
     * 子目录id
     */
    private String sonId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 文件数量
     */
    private Integer fileNumber;

    /**
     * 文件夹大小
     */
    private Integer dirSize;

    /**
     * 删除时间
     */
    private Date deleteTime;

    /**
     * 是否删除
     */
    private String isDelete;

    /**
     * 用户id
     */
    private String userId;

    public String getUserDirId() {
        return userDirId;
    }

    public void setUserDirId(String userDirId) {
        this.userDirId = userDirId == null ? null : userDirId.trim();
    }

    public String getDirName() {
        return dirName;
    }

    public void setDirName(String dirName) {
        this.dirName = dirName == null ? null : dirName.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getSonId() {
        return sonId;
    }

    public void setSonId(String sonId) {
        this.sonId = sonId == null ? null : sonId.trim();
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

    public Integer getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(Integer fileNumber) {
        this.fileNumber = fileNumber;
    }

    public Integer getDirSize() {
        return dirSize;
    }

    public void setDirSize(Integer dirSize) {
        this.dirSize = dirSize;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}