package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class IO {
	static FileOutputStream out;
	static ZipOutputStream outt;
	private static FileInputStream temp_in;
	public static void mlzip(File file) throws IOException {
		//System.out.println(file.listFiles().length);
		if(file.listFiles().length == 0) {
			String path = file.getPath() + '/';
			//System.out.println(path);
			ZipEntry temp = new ZipEntry(path);
			outt.putNextEntry(temp);
			outt.closeEntry();
		}
		else {
			File temp_file_list[] = file.listFiles();
			for(int i = 0;i<temp_file_list.length;++i) {
				if(temp_file_list[i].isDirectory()) {
					mlzip(temp_file_list[i]);
				}
				else {
					temp_in = new FileInputStream(temp_file_list[i]);
					ZipEntry temp = new ZipEntry(temp_file_list[i].getPath());
					outt.putNextEntry(temp);
					int a;
					while((a = temp_in.read())!=-1) {
						outt.write(a);
					}
					outt.closeEntry();
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		out = new FileOutputStream("D://java.zip");
		outt = new ZipOutputStream(out);
		File file = new File("D://java");
		//System.out.println(file.getPath());
		mlzip(file);
		outt.close();
		
	}

}
