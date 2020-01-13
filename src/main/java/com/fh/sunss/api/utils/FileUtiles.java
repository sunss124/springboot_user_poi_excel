package com.fh.sunss.api.utils;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

public class FileUtiles {
	/*
	 * 将文件保存到指定目录下   
	 * 返回保存文件的路径
	 */
	public static String  saveFile(HttpServletRequest request,InputStream is,String filename,String sd){
		String savePath="";
		//获取项目的绝对路径
		String realPath = request.getServletContext().getRealPath("/");
		//保存的目录
		String saveDir=realPath+sd;
		//确定目录是否存在
		File f=new File(saveDir);
		boolean exists = f.exists();
		if(exists==false){
			f.mkdirs();
		};
		//保存目录已经确定下来  
		//将上传的文件 拷贝到指定目录下
		//将保存的文件 进行重命名（防止特殊字符引起 访问异常）
		//先获取文件名   aaa.jpg  aaa.png  aaa.jpeg
		//获取文件的格式
		String fileType=filename.substring(filename.lastIndexOf("."));
		//设置新名  （必须唯一）   uuid 随机生成32位的字符串 不重复
		String newName=UUID.randomUUID().toString()+fileType;
		//拷贝
		try {
			//输出流
			FileOutputStream os=new FileOutputStream(saveDir+"/"+newName);
			//设置每次读写的字节数
			byte[] bt=new byte[2048];
			while(is.read(bt)!=-1){
				os.write(bt);
			};
			os.close();
			is.close();
			savePath=sd+"/"+newName;
			//文件处理完 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return savePath;
	}

}
