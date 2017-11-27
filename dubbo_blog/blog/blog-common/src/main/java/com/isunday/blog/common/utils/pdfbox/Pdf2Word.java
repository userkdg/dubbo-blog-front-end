package com.isunday.blog.common.utils.pdfbox;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Test;

/**
 * 转换的word没有格式
 * @author win7
 *
 */
public class Pdf2Word {
	private static final String PATH_NAME = "C:/demo.pdf";

	
	@Test
	public void Pdf2Word() throws InvalidPasswordException, IOException{
		PDDocument pdDocument = PDDocument.load(new File(PATH_NAME));
		int numPage = pdDocument.getNumberOfPages();
		
		String outpath =  PATH_NAME.substring(0, PATH_NAME.lastIndexOf(".")) + ".doc";
		FileOutputStream fop = new FileOutputStream(outpath);
		
		Writer writer = new OutputStreamWriter(fop, "UTF-8");
	
		PDFTextStripper stripper = new PDFTextStripper();

		//stripper.setWordSeparator("");//pdfbox对中文默认是用空格分隔每一个字，通过这个语句消除空格（视频是这么说的）
		stripper.setSortByPosition(true);
        stripper.setStartPage(1);//设置转换的开始页
        stripper.setEndPage(numPage);//设置转换的结束页
        stripper.writeText(pdDocument,writer);
        writer.close();
        pdDocument.close();
	}
}
