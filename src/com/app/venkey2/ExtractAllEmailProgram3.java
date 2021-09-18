package com.app.venkey2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllEmailProgram3 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new FileReader("TextFile.txt"));
		Pattern pt = Pattern.compile("[a-zA-Z0-9]" + "[a-zA-Z0-9_.]" + "*@[a-zA-Z0-9]" + "+([.][a-zA-Z]+)+");

		String sCurrentLine;

		while ((sCurrentLine = bfr.readLine()) != null) {
			Matcher mt = pt.matcher(sCurrentLine);

			while (mt.find()) {
				System.out.println(mt.group());
			}
		}
	}
}