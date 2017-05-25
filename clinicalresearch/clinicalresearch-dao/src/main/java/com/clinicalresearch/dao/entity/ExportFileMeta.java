package com.clinicalresearch.dao.entity;

import java.util.Date;

public class ExportFileMeta {
    private Integer fileId;

    private String userId;

    private String filePath;

    private String fileName;

    private Date fileStartTime;

    private Date fileEndTime;

    private String fileSize;

    private String fileProcessPer;

    private String fileStatus;

    private String fileExp;

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Date getFileStartTime() {
        return fileStartTime;
    }

    public void setFileStartTime(Date fileStartTime) {
        this.fileStartTime = fileStartTime;
    }

    public Date getFileEndTime() {
        return fileEndTime;
    }

    public void setFileEndTime(Date fileEndTime) {
        this.fileEndTime = fileEndTime;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize == null ? null : fileSize.trim();
    }

    public String getFileProcessPer() {
        return fileProcessPer;
    }

    public void setFileProcessPer(String fileProcessPer) {
        this.fileProcessPer = fileProcessPer == null ? null : fileProcessPer.trim();
    }

    public String getFileStatus() {
        return fileStatus;
    }

    public void setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus == null ? null : fileStatus.trim();
    }

    public String getFileExp() {
        return fileExp;
    }

    public void setFileExp(String fileExp) {
        this.fileExp = fileExp == null ? null : fileExp.trim();
    }
}