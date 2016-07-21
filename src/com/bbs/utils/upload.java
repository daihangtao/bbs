package com.bbs.utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.Date;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.util.Progressable;
import org.springframework.web.multipart.MultipartFile;

public class upload {

	static String dst = "hdfs://192.168.254.129:9000/yunketang/";
	public static void main(String[] args) throws Exception {
		try {
			uploadToHdfs(null,null);
			// deleteFromHdfs();
			// getDirectoryFromHdfs();
			// appendToHdfs();
			// readFromHdfs();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("SUCCESS");
		}
	}

	/** 上传文件到HDFS上去 
	 * @throws IOException */
	public static String  uploadToHdfs(MultipartFile file) throws IOException {
		Date date = new Date();
		// 取文件的类型，后缀名
		String filetype = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		// 我们构建一个随机文件名称， 2015-15-310834.jpg
		String fileName = date.getTime() + filetype;
			InputStream in = file.getInputStream();
			Configuration conf = new Configuration(); // 用来读取配置文件
			FileSystem fs = FileSystem.get(URI.create(dst + fileName), conf);
			OutputStream out = fs.create(new Path(dst + fileName));
			IOUtils.copyBytes(in, out, 4096, true);
		return fileName;
	}
	
	
	
	
	public static void uploadToHdfs(String localSrc1,String fileName) throws FileNotFoundException, IOException {
		String localSrc = localSrc1;
		String dst = "hdfs://192.168.254.129:9000/yunketang/"+fileName;
		InputStream in = new BufferedInputStream(new FileInputStream(localSrc));
		
		Configuration conf = new Configuration(); //用来读取配置文件
		// conf.set("hadoop.job.userhadoop.job.ugi", "root");
		// conf.set("hadoop.job.user", "root");
		FileSystem fs = FileSystem.get(URI.create(dst), conf);

		OutputStream out = fs.create(new Path(dst), new Progressable() {
			public void progress() {
				System.out.print(".");
			}
		});
		IOUtils.copyBytes(in, out, 4096, true);
	}

	/** 从HDFS上读取文件 */
	private static void readFromHdfs() throws FileNotFoundException, IOException {
		String dst = "hdfs://192.168.121.131:9000/qq.txt";
		
		Configuration conf = new Configuration();
		FileSystem fs = FileSystem.get(URI.create(dst), conf);
		FSDataInputStream hdfsInStream = fs.open(new Path(dst));

		OutputStream out = new FileOutputStream("d:/qq-hdfs.txt");
		byte[] ioBuffer = new byte[1024];
		int readLen = hdfsInStream.read(ioBuffer);

		while (-1 != readLen) {
			out.write(ioBuffer, 0, readLen);
			readLen = hdfsInStream.read(ioBuffer);
		}
		out.close();
		hdfsInStream.close();
		fs.close();
	}

	/**
	 * 以append方式将内容添加到HDFS上文件的末尾;注意：文件更新，需要在hdfs-site.xml中添
	 * <property><name>dfs.append.support</name><value>true</value></property>
	 */
	private static void appendToHdfs() throws FileNotFoundException, IOException {
		String dst = "hdfs://192.168.88.129:9000/test/qq.txt";
		Configuration conf = new Configuration();
		FileSystem fs = FileSystem.get(URI.create(dst), conf);
		FSDataOutputStream out = fs.append(new Path(dst));

		int readLen = "zhangzk add by hdfs java api".getBytes().length;

		while (-1 != readLen) {
			out.write("zhangzk add by hdfs java api".getBytes(), 0, readLen);
		}
		out.close();
		fs.close();
	}

	/** 从HDFS上删除文件 */
	private static void deleteFromHdfs() throws FileNotFoundException, IOException {
		String dst = "hdfs://192.168.88.129:9000/test/qq-bak.txt";
		Configuration conf = new Configuration();
		FileSystem fs = FileSystem.get(URI.create(dst), conf);
		fs.deleteOnExit(new Path(dst));
		fs.close();
	}

	/** 遍历HDFS上的文件和目录 */
	private static void getDirectoryFromHdfs() throws FileNotFoundException, IOException {
		String dst = "hdfs://192.168.121.131:9000/test";
		Configuration conf = new Configuration();
		FileSystem fs = FileSystem.get(URI.create(dst), conf);
		FileStatus fileList[] = fs.listStatus(new Path(dst));
		int size = fileList.length;
		for (int i = 0; i < size; i++) {
			System.out.println("name:" + fileList[i].getPath().getName() + "--/t/tsize:" + fileList[i].getLen());
		}
		fs.close();
	}

}
