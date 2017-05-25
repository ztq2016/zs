package com.clinicalresearch.core.bean;
/**
 * 导出文件列表
 * @author ztq_2016
 *
 */
public class ExportFile {
	
	/*是否导出完成*/
	private boolean isEnd;
	/*导出问价名称*/
	private String exportName;
	/*导出百分比*/
	private String per;
	/*导出时间*/
	private String time;
	/*文件名称*/
	private Integer fileId;
	
	public boolean isEnd() {
		return isEnd;
	}
	public void setEnd(boolean isEnd) {
		this.isEnd = isEnd;
	}
	public String getExportName() {
		return exportName;
	}
	public void setExportName(String exportName) {
		this.exportName = exportName;
	}
	public String getPer() {
		return per;
	}
	public void setPer(String per) {
		this.per = per;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Integer getFileId() {
		return fileId;
	}
	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}
	
}
