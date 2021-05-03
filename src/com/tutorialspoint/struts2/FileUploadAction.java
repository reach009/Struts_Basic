package com.tutorialspoint.struts2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {
	private File fileUpload;
	private String fileUploadContentType;
	private String fileUploadFileName;
	private final String DESTINATION_PATH = "C:\\Users\\Boybabyrage\\eclipse-workspace\\HelloWorldStruts2\\fileUploadTest";

	// logger
	private static final Logger logger = LogManager.getLogger(HelloWorldAction.class);

	public String getFileUploadContentType() {
		return fileUploadContentType;
	}

	public void setFileUploadContentType(String fileUploadContentType) {
		this.fileUploadContentType = fileUploadContentType;
	}

	public String getFileUploadFileName() {
		return fileUploadFileName;
	}

	public void setFileUploadFileName(String fileUploadFileName) {
		this.fileUploadFileName = fileUploadFileName;
	}

	public File getFileUpload() {
		return fileUpload;
	}

	public void setFileUpload(File fileUpload) {
		this.fileUpload = fileUpload;
	}

	public String getDESTINATION_PATH() {
		return DESTINATION_PATH;
	}

	@Override
	public String execute() {

		try {
			System.out.println("Src File name: " + fileUpload);
			System.out.println("Dst File name: " + fileUploadFileName);

			File destFile = new File(DESTINATION_PATH, fileUploadFileName);
			FileUtils.copyFile(fileUpload, destFile);

			logger.info("File upload succcessed!");

		} catch (IOException e) {
			e.printStackTrace();
			return ERROR;
		}

		return SUCCESS;
	}

	public String display() {
		return NONE;
	}
}
