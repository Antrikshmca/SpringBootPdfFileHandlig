package com.antriksh.app;

import java.io.IOException;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class PdfFileReading {
	private static final String FILE_NAME = "E:\\PSA\\SpringBootPDFFileHandling\\PdfDocs\\sample1.pdf";

	public static void pdfReader() {

		PdfReader reader;

		try {

			reader = new PdfReader("E:\\PSA\\SpringBootPDFFileHandling\\PdfDocs\\sample1.pdf");

			// pageNumber = 1
			String textFromPage = PdfTextExtractor.getTextFromPage(reader, 1);

			System.out.println(textFromPage);

			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
