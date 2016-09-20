package cn.sxt.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	
	@RequestMapping(path = "/upload", method = RequestMethod.GET)
	public String fileupload() {
		return "upload";
	}
	
	@RequestMapping(path = "/upload", method = RequestMethod.POST)
	public String fileupload(@RequestParam("file")CommonsMultipartFile file, HttpServletRequest req) {
		
		// 获取文件名
		// System.out.println(file.getOriginalFilename());
		// 获取上传文件的路径
		String path = req.getSession().getServletContext().getRealPath("/") + "upload";
		
		System.out.println(path);
		InputStream inputStream;
		try {
			inputStream = file.getInputStream();
			
			OutputStream outputStream = new FileOutputStream(new File(path, file.getOriginalFilename()));
			int len = 0;
			byte[] buffer = new byte[400];
			while ((len = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, len);
			}
			inputStream.close();
			outputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "upload";
	}
}
