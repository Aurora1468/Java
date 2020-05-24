package Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D://java//12345");
		System.out.println(file.getName());
		FileOutputStream out = new FileOutputStream("D://java//12345.zip");
		ZipEntry zip = new ZipEntry(file.getName()+'/');
		ZipOutputStream outt = new ZipOutputStream(out);
		outt.putNextEntry(zip);
		outt.close();
		
	}

}
