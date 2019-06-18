package com.wangzefeng.tools;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.StringTokenizer;

/**
 * @Description: 文件操作工具类
 * @author shixin
 * @date 2013-11-25
 * @version V2.0
 */
public class FileUtil {


	private static final Log LOG = LogFactory.getLog(FileUtil.class);

	/**
	 * 获取文件名称（无后缀）
	 * @param fileName
	 * @return
	 */
	public static String getFilePrefix(String fileName){
		if(isNotEmpty(fileName)){
			int pointIndex=fileName.lastIndexOf(".");
			if(pointIndex>=0){
				return fileName.substring(0, pointIndex);
			}
		}
		return fileName;
	}

	/**
	 * 获取文件后缀（带点）
	 * @param fileName
	 * @return
	 */
	public static String getFileSuffix(String fileName){
		if(isNotEmpty(fileName)){
			int pointIndex=fileName.lastIndexOf(".");
			if(pointIndex>=0){
				return fileName.substring(pointIndex);
			}else{
				return null;
			}
		}
		return fileName;
	}

	/**
	 * 获取文件名称不带后缀
	 * @param fileName
	 * @return
	 */
	public static String getFileName(String fileName){
		if(isNotEmpty(fileName)){
			int pointIndex=fileName.lastIndexOf(".");
			if(pointIndex>=0){
				return fileName.substring(0,pointIndex);
			}else{
				return null;
			}
		}
		return fileName;
	}

	/**
	 * 获取文件后缀（不带点）
	 * @param fileName
	 * @return
	 */
	public static String getFileSuffixNotWithPoint(String fileName){
		if(isNotEmpty(fileName)){
			int pointIndex=fileName.lastIndexOf(".");
			return pointIndex>=0?fileName.substring(pointIndex+1).toLowerCase():null;
		}
		return fileName;
	}
	/**
	 * 字符串是否为空
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str){
		return (str!=null&&!"".equals(str.trim()));
	}
    /**
     *  根据路径删除指定的目录或文件，无论存在与否
     *@param sPath  要删除的目录或文件
     *@return 删除成功返回 true，否则返回 false。
     */
    public static boolean DeleteFolder(String sPath) {
       boolean flag = false;
       File file = new File(sPath);
        // 判断目录或文件是否存在
        if (!file.exists()) {  // 不存在返回 false
            return flag;
        } else {
            // 判断是否为文件
            if (file.isFile()) {  // 为文件时调用删除文件方法
                return deleteFile(sPath);
            } else {  // 为目录时调用删除目录方法
                return deleteDirectory(sPath);
            }
        }
    }
    /**
     * 删除单个文件
     * @param   sPath    被删除文件的文件名
     * @return 单个文件删除成功返回true，否则返回false
     */
    public static boolean deleteFile(String sPath) {
    	boolean flag = false;
       File file = new File(sPath);
        // 路径为文件且不为空则进行删除
        if (file.isFile() && file.exists()) {
            file.delete();
            flag = true;
        }
        return flag;
    }
    /**
     * 删除目录（文件夹）以及目录下的文件
     * @param   sPath 被删除目录的文件路径
     * @return  目录删除成功返回true，否则返回false
     */
    public static boolean deleteDirectory(String sPath) {
        //如果sPath不以文件分隔符结尾，自动添加文件分隔符
        if(!ValidateUtil.validateString(sPath))return true;
	if (!sPath.endsWith(File.separator)) {
            sPath = sPath + File.separator;
        }
        File dirFile = new File(sPath);
        //如果dir对应的文件不存在，或者不是一个目录，则退出
        if (!dirFile.exists() || !dirFile.isDirectory()) {
            return false;
        }
        boolean flag = true;
        //删除文件夹下的所有文件(包括子目录)
        File[] files = dirFile.listFiles();
        for (int i = 0; i < files.length; i++) {
            //删除子文件
            if (files[i].isFile()) {
                flag = deleteFile(files[i].getAbsolutePath());
                if (!flag) break;
            } //删除子目录
            else {
                flag = deleteDirectory(files[i].getAbsolutePath());
                if (!flag) break;
            }
        }
        if (!flag) return false;
        //删除当前目录
        if (dirFile.delete()) {
            return true;
        } else {
            return false;
        }
    }

    /**
	 * 新建文件
	 *
	 * @param filePathAndName
	 *            文本文件完整绝对路径及文件名
	 * @param fileContent
	 *            文本文件内容
	 * @return
	 */
	public static void createFile(String filePathAndName, String fileContent) {

		try {
			String filePath = filePathAndName;
			filePath = filePath.toString();
			File myFilePath = new File(filePath);
			if (!myFilePath.exists()) {
				myFilePath.createNewFile();
			}
			FileWriter resultFile = new FileWriter(myFilePath);
			PrintWriter myFile = new PrintWriter(resultFile);
			String strContent = fileContent;
			myFile.println(strContent);
			myFile.close();
			resultFile.close();
		} catch (Exception e) {
		  LOG.info(filePathAndName+"  文件创建出现错误");
		}
	}


	/**
	 * 有编码方式的文件创建
	 *
	 * @param filePathAndName
	 *            文本文件完整绝对路径及文件名
	 * @param fileContent
	 *            文本文件内容
	 * @param encoding
	 *            编码方式 例如 GBK 或者 UTF-8
	 * @return
	 * @throws Exception
	 */
	public static void createFile(String filePathAndName, String fileContent,
                                  String encoding) throws Exception {

		try {
			String filePath = filePathAndName;
			filePath = filePath.toString();
			File myFilePath = new File(filePath);
			if(!myFilePath.getParentFile().exists()){
				if(myFilePath.getParentFile().mkdirs()){
				}
			}
			if (!myFilePath.exists()) {
				myFilePath.createNewFile();
			}

			PrintWriter myFile = new PrintWriter(myFilePath, encoding);
			String strContent = fileContent;
			myFile.println(strContent);
			myFile.close();

		} catch (Exception e) {
			LOG.info(filePathAndName+"  文件创建出现错误");
			throw e;
		}
	}

	/**
	 * 新建目录
	 *
	 * @param folderPath
	 *            目录
	 * @return 返回目录创建后的路径
	 */
	public String createFolder(String folderPath) {
		String txt = folderPath;
		try {
			File myFilePath = new File(txt);
			txt = folderPath;
			if (!myFilePath.exists()) {
				myFilePath.mkdir();
			}
		} catch (Exception e) {
			LOG.info("创建目录操作出错");
		}
		return txt;
	}

	/**
	 * 多级目录创建
	 *
	 * @param folderPath
	 *            准备要在本级目录下创建新目录的目录路径例如 c:myf
	 * @param paths
	 *            无限级目录参数，各级目录以单数线区分 例如 a|b|c
	 * @return 返回创建文件后的路径
	 */
	public String createFolders(String folderPath, String paths) {
		String txts = folderPath;
		try {
			String txt;
			txts = folderPath;
			StringTokenizer st = new StringTokenizer(paths, "|");
			for (int i = 0; st.hasMoreTokens(); i++) {
				txt = st.nextToken().trim();
				if (txts.lastIndexOf("/") != -1) {
					txts = createFolder(txts + txt);
				} else {
					txts = createFolder(txts + txt + "/");
				}
			}
		} catch (Exception e) {
			LOG.info("创建目录操作出错");
		}
		return txts;
	}


	/**
	 * 读取文本文件内容
	 *
	 * @param filePathAndName
	 *            带有完整绝对路径的文件名
	 * @param encoding
	 *            文本文件打开的编码方式
	 * @return 返回文本文件的内容
	 */
	public static String readTxt(String filePathAndName, String encoding)
			throws IOException {
		encoding = encoding.trim();
		StringBuffer str = new StringBuffer("");
		String st = "";
		try {
			FileInputStream fs = new FileInputStream(filePathAndName);
			InputStreamReader isr;
			if (encoding.equals("")) {
				isr = new InputStreamReader(fs);
			} else {
				isr = new InputStreamReader(fs, encoding);
			}
			BufferedReader br = new BufferedReader(isr);
			try {
				String data = "";
				while ((data = br.readLine()) != null) {
					str.append(data).append("\n");
				}
			} catch (Exception e) {
				str.append(e.toString());
			}
			st = str.toString();
			if (st != null && st.length() > 1)
				st = st.substring(0, st.length() - 1);
		} catch (IOException es) {
			st = "";
		}
		return st;
	}


	/**
	 * 读取文本文件内容
	 *
	 * @param fileUrl
	 *            带有完整绝对路径的文件名
	 * @param encoding
	 *            文本文件打开的编码方式
	 * @return 返回文本文件的内容
	 */
	public static String readUrlTxt(String fileUrl, String encoding)
			throws IOException {
		encoding = encoding.trim();
		StringBuffer str = new StringBuffer("");
		String st = "";
		InputStreamReader fs=null;
		try {
			URL uri=new URL(fileUrl);
			if (encoding.equals("")) {
				fs= new InputStreamReader(uri.openStream());
			} else {
				fs= new InputStreamReader(uri.openStream(),encoding);
			}
			BufferedReader br = new BufferedReader(fs);
			try {
				String data = "";
				while ((data = br.readLine()) != null) {
					str.append(data);
				}
			} catch (Exception e) {
				str.append(e.toString());
			}
			st = str.toString();
			if (st != null && st.length() > 1)
				st = st.substring(0, st.length() - 1);
		} catch (IOException es) {
			st = "";
		}
		return st;
	}


	/**
	 * 读取文本文件内容
	 *
	 * @param url  网络地址
	 *
	 * @return 返回地址是否响应
	 */
	public static boolean existsUrl(String url){
		try {
	         //设置此类是否应该自动执行 HTTP 重定向（响应代码为 3xx 的请求）。
	         HttpURLConnection.setFollowRedirects(false);
	         //到 URL 所引用的远程对象的连接
	         HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
	         /* 设置 URL 请求的方法， GET POST HEAD OPTIONS PUT DELETE TRACE 以上方法之一是合法的，具体取决于协议的限制。*/
	         con.setConnectTimeout(3*1000);
	         con.setRequestMethod("HEAD");
	         //从 HTTP 响应消息获取状态码

	         return (con.getResponseCode() < HttpURLConnection.HTTP_BAD_REQUEST);
	     } catch (Exception e) {
	         return false;
	     }
	}



	/**
	 * 复制单个文件
	 *
	 * @param oldPathFile
	 *            准备复制的文件源
	 * @param newPathFile
	 *            拷贝到新绝对路径带文件名
	 * @return
	 */
	public static void copyFile(String oldPathFile, String newPathFile) {
		InputStream inStream =null;
		FileOutputStream fs=null;
		try {
			int bytesum = 0;
			int byteread = 0;
			File oldfile = new File(oldPathFile);
			if (oldfile.exists()) { // 文件存在
				inStream = new FileInputStream(oldPathFile); // 读入源文件
				File file = new File(newPathFile);
				if(!file.exists()){
					file.getParentFile().mkdirs();
					file.createNewFile();
				}
				fs = new FileOutputStream(newPathFile);
				byte[] buffer = new byte[1444];
				while ((byteread = inStream.read(buffer)) != -1) {
					bytesum += byteread; // 字节 文件大小
					fs.write(buffer, 0, byteread);
				}
				fs.flush();
			}
		} catch (Exception e) {
			LOG.info("复制单个文件操作出错");
		}finally{
			try {
				 if(inStream!=null)
					 inStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				 if(fs!=null)
					 fs.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 复制整个文件夹的内容
	 *
	 * @param oldPath
	 *            准备拷贝的目录
	 * @param newPath
	 *            指定绝对路径的新目录
	 * @return
	 */
	public static void copyFolder(String oldPath, String newPath) {
		try {
			new File(newPath).mkdirs(); // 如果文件夹不存在 则建立新文件
			File a = new File(oldPath);
			String[] file = a.list();
			File temp = null;
			for (int i = 0; i < file.length; i++) {
				if (oldPath.endsWith(File.separator)) {
					temp = new File(oldPath + file[i]);
				} else {
					temp = new File(oldPath + File.separator + file[i]);
				}
				if (temp.isFile()) {
					FileInputStream input = new FileInputStream(temp);
					FileOutputStream output = new FileOutputStream(newPath
							+ "/" + (temp.getName()).toString());
					byte[] b = new byte[1024 * 5];
					int len;
					while ((len = input.read(b)) != -1) {
						output.write(b, 0, len);
					}
					output.flush();
					output.close();
					input.close();
				}
				if (temp.isDirectory()) {// 如果是子文件
					copyFolder(oldPath + "/" + file[i], newPath + "/" + file[i]);
				}
			}
		} catch (Exception e) {
			LOG.info("复制整个文件夹内容操作出错");
		}
	}

	/**
	 * 移动文件
	 *
	 * @param oldPath
	 * @param newPath
	 * @return
	 */
	public static void moveFile(String oldPath, String newPath) {
		copyFile(oldPath, newPath);
		deleteFile(oldPath);
	}

	/**
	 * 移动目录
	 *
	 * @param oldPath
	 * @param newPath
	 * @return
	 */
	public static void moveFolder(String oldPath, String newPath) {
		copyFolder(oldPath, newPath);
		deleteFile(oldPath);
	}
	public static void main(String[] args) {

	}

	/**
	 * 从一个文件中读取一个对象
	 * @author chenjie@hzunitech.com
	 * @date 2014-11-13
	 * @param file
	 * @return
	 * @throws Exception
	 */
	public static Object readObjectByFile(File file) {
		if (!file.exists() || !file.isFile() ) {
			return null;
		}
		ObjectInputStream is = null;
		Object obj = null;
		try {
			is = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
			obj = is.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally{
			try {
				 if(is!=null)
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


		return obj;
	}
	/**
	 * 将一个序列化的对象输出到文件
	 * @author chenjie@hzunitech.com
	 * @date 2014-11-13
	 * @param file
	 * @param obj
	 * @throws Exception
	 */
	public static boolean writeObjectToFile(File file, Object obj) {
		if(!file.getParentFile().exists()){
			if(file.getParentFile().mkdirs()){
			}
		}
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}
		 ObjectOutputStream os =null;
		try {
			os = new ObjectOutputStream( new BufferedOutputStream(
			         new FileOutputStream(file)));
			 os.writeObject(obj);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} finally{
			 try {
				 if(os!=null)
					 os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}




	public static Object readObjectByFile2(File file) {
		if (!file.exists() || !file.isFile() ) {
			return null;
		}
		ObjectInputStream is = null;
		Object obj = null;
		try {
			is = new ObjectInputStream(new FileInputStream(file));
			obj = is.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally{
			try {
				 if(is!=null)
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


		return obj;
	}
	/**
	 * 将一个序列化的对象输出到文件
	 * @author chenjie@hzunitech.com
	 * @date 2014-11-13
	 * @param file
	 * @param obj
	 * @throws Exception
	 */
	public static boolean writeObjectToFile2(File file, Object obj) {
		if(!file.getParentFile().exists()){
			if(file.getParentFile().mkdirs()){
			}
		}
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}
		 ObjectOutputStream os =null;
		try {
			os = new ObjectOutputStream(
			         new FileOutputStream(file));
			 os.writeObject(obj);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} finally{
			 try {
				 if(os!=null)
					 os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}

	/**
     * 获得指定文件的byte数组
     */
    public static byte[] getBytes(String filePath){
        byte[] buffer = null;
        try {
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);
            byte[] b = new byte[1000];
            int n;
            while ((n = fis.read(b)) != -1) {
                bos.write(b, 0, n);
            }
            fis.close();
            bos.close();
            buffer = bos.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer;
    }

    /**
     * 根据byte数组，生成文件
     */
    public static void getFile(byte[] bfile, String filePath, String fileName) {
        BufferedOutputStream bos = null;
        FileOutputStream fos = null;
        File file = null;
        try {
            File dir = new File(filePath);
            if(!dir.exists()){//判断文件目录是否存在
                dir.mkdirs();
            }
            file = new File(filePath+File.separator+fileName);
            fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            bos.write(bfile);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    public static void copyInputStreamToFile(InputStream in,File file){
		byte[] buffer = null;
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);
			byte[] b = new byte[1000];
			int n;
			while ((n = in.read(b)) != -1) {
				bos.write(b, 0, n);
			}
			in.close();
			bos.close();
			buffer = bos.toByteArray();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		getFile(buffer,file.getParentFile().getPath(),file.getName());
	}
}
