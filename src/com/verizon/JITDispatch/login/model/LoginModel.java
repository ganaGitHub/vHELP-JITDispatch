package com.verizon.JITDispatch.login.model;

import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.log4j.Logger;

public class LoginModel {
private static Logger logger = Logger.getLogger("JITDispatch");
	
//	public ArrayList<UserDetailsBean> loadUserDetails() throws Exception {
//		ArrayList<UserDetailsBean> userDetailsBeanAL = new ArrayList<UserDetailsBean>();
//		
//		String userDetailsFileName = FileConstants.userDetailsFile;
//		logger.debug("userDetailsFileName: " + userDetailsFileName);
//		
//		String csvFilesDir = FileConstants.csvFilesDir;
//		logger.debug("csvFilesDir: " + csvFilesDir);
//		
//		String userDetailsAbsFileName = csvFilesDir + userDetailsFileName;
//		logger.debug("userDetailsAbsFileName: " + userDetailsAbsFileName);
//		
//		String[] userDetailsFieldsArray = null;
//		String userName = null;
//		String password = null;
//		String grouup = null;
//		String role = null;
//		
//		String fileDelimiter = ",";
//		
//		Properties fileConfigProps = null;
//		FileConfig fileConfigObj = new FileConfig();
//		String configDir = FileConstants.configDir;
//		fileConfigProps = fileConfigObj.readConfigFile(configDir);
//		int fileIndex = fileConfigObj.getFileIndex(userDetailsFileName, fileConfigProps);
//		fileDelimiter = fileConfigObj.getFileDelimiter(fileIndex, fileConfigProps);
//		logger.debug("fileDelimiter: " + fileDelimiter);
//		
//		FileReader userDetailsAbsFileReader = null;
//		LineNumberReader userDetailsAbsFileLR = null;	
//		try {
//			File userDetailFile = new File(userDetailsAbsFileName);
//			userDetailsAbsFileReader = new FileReader(userDetailsAbsFileName);
//			userDetailsAbsFileLR = new LineNumberReader(userDetailsAbsFileReader);
//
//			String header = userDetailsAbsFileLR.readLine();
//			logger.debug("header: " + header);
//
//			String line = null;
//			while ((line = userDetailsAbsFileLR.readLine()) != null) {
//				logger.debug("line: " + line);
//				
//				UserDetailsBean userDetailsBeanObj = new UserDetailsBean();
//				userDetailsFieldsArray = line.split(fileDelimiter);
//				
//				if(4 == userDetailsFieldsArray.length) {
//					for(int i = 0; i < userDetailsFieldsArray.length; i++)
//					{
//						userDetailsBeanObj.setUserName(userDetailsFieldsArray[0]);
//						userDetailsBeanObj.setPassword(userDetailsFieldsArray[1]);
//						userDetailsBeanObj.setGroup(userDetailsFieldsArray[2]);
//						userDetailsBeanObj.setRole(userDetailsFieldsArray[3]);
//					}
//					
//					logger.debug(userDetailsBeanObj.toString());
//					userDetailsBeanAL.add(userDetailsBeanObj);
//				}
//				else
//				{
//					logger.error("Record doesn't have all the details, line: " + line);
//				}
//			}			
//		} catch (Exception e) {
//			logger.error("Exception occurred while reading the user details file");
//			logger.error(e, e);
//			throw new Exception("Exception occurred while reading the user details file");
//		}
//		
//		finally {
//			try {
//				if (userDetailsAbsFileReader != null) {
//					userDetailsAbsFileReader.close();
//				}
//				if (userDetailsAbsFileLR != null) {
//					userDetailsAbsFileLR.close();
//				}
//			} catch (Exception e) {
//				logger.error("Exception occurred while closing the file");
//				logger.error(e, e);
//				throw new Exception("Exception occurred while closing the file");
//			}
//		}
//		
//		logger.debug(userDetailsBeanAL);
//		return userDetailsBeanAL;
//	}
}
