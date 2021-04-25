package com.tutorialspoint.struts2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class FileUpload extends ActionSupport {
	private File myFile;
	private String myFileContentType;
	private String myFileFileName;
	private String destPath;

//	Logger
	private static final Logger logger = LogManager.getLogger(HelloWorldAction.class);

	@Override
	public String execute() {
		/* Copy file to a safe location */
		destPath = "C:\\Users\\Boybabyrage\\eclipse-workspace\\HelloWorldStruts2\\test";

		try {
			logger.info("Src File name: " + myFile);
			logger.info("Dst File name: " + myFileFileName);

			File destFile = new File(destPath, myFileFileName);
			FileUtils.copyFile(myFile, destFile);

		} catch (IOException e) {
			e.printStackTrace();
			logger.error("Something did not go right with file upload!");
			return ERROR;
		}

		return SUCCESS;
	}

	public File getMyFile() {
		return myFile;
	}

	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	public String getMyFileContentType() {
		return myFileContentType;
	}

	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}

	public String getMyFileFileName() {
		return myFileFileName;
	}

	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}
}
