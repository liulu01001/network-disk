package com.liulu.networkDisk.model;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author liu_lu
 * @date  2019-03-30 16:27
 * @description 文件管理
 */
@Component
public class DiskFileModel {
    /**
     * 文件id
     */
    @Id
    private String fileId;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 文件所在文件夹的id
     */
    private String fileDirId;

    /**
     * 文件的类型
     */
    private String fileType;

    /**
     * 文件上传时间
     */
    private Date fileUploadTime;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 文件大小
     */
    private Float fileSize;

    /**
     * 文件下载时间
     */
    private Date fileDownloadTime;

    /**
     * 文件下载次数
     */
    private Integer fileDownloadNumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column disk_file.file_id
     *
     * @return the value of disk_file.file_id
     *
     * @mbggenerated
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column disk_file.file_id
     *
     * @param fileId the value for disk_file.file_id
     *
     * @mbggenerated
     */
    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column disk_file.file_name
     *
     * @return the value of disk_file.file_name
     *
     * @mbggenerated
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column disk_file.file_name
     *
     * @param fileName the value for disk_file.file_name
     *
     * @mbggenerated
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column disk_file.file_dir_id
     *
     * @return the value of disk_file.file_dir_id
     *
     * @mbggenerated
     */
    public String getFileDirId() {
        return fileDirId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column disk_file.file_dir_id
     *
     * @param fileDirId the value for disk_file.file_dir_id
     *
     * @mbggenerated
     */
    public void setFileDirId(String fileDirId) {
        this.fileDirId = fileDirId == null ? null : fileDirId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column disk_file.file_type
     *
     * @return the value of disk_file.file_type
     *
     * @mbggenerated
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column disk_file.file_type
     *
     * @param fileType the value for disk_file.file_type
     *
     * @mbggenerated
     */
    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column disk_file.file_upload_time
     *
     * @return the value of disk_file.file_upload_time
     *
     * @mbggenerated
     */
    public Date getFileUploadTime() {
        return fileUploadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column disk_file.file_upload_time
     *
     * @param fileUploadTime the value for disk_file.file_upload_time
     *
     * @mbggenerated
     */
    public void setFileUploadTime(Date fileUploadTime) {
        this.fileUploadTime = fileUploadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column disk_file.user_id
     *
     * @return the value of disk_file.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column disk_file.user_id
     *
     * @param userId the value for disk_file.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column disk_file.file_size
     *
     * @return the value of disk_file.file_size
     *
     * @mbggenerated
     */
    public Float getFileSize() {
        return fileSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column disk_file.file_size
     *
     * @param fileSize the value for disk_file.file_size
     *
     * @mbggenerated
     */
    public void setFileSize(Float fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column disk_file.file_download_time
     *
     * @return the value of disk_file.file_download_time
     *
     * @mbggenerated
     */
    public Date getFileDownloadTime() {
        return fileDownloadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column disk_file.file_download_time
     *
     * @param fileDownloadTime the value for disk_file.file_download_time
     *
     * @mbggenerated
     */
    public void setFileDownloadTime(Date fileDownloadTime) {
        this.fileDownloadTime = fileDownloadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column disk_file.file_download_number
     *
     * @return the value of disk_file.file_download_number
     *
     * @mbggenerated
     */
    public Integer getFileDownloadNumber() {
        return fileDownloadNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column disk_file.file_download_number
     *
     * @param fileDownloadNumber the value for disk_file.file_download_number
     *
     * @mbggenerated
     */
    public void setFileDownloadNumber(Integer fileDownloadNumber) {
        this.fileDownloadNumber = fileDownloadNumber;
    }
}