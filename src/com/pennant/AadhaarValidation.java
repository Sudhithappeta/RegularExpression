package com.pennant;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AadhaarValidation {

	public static void numberValidation() {

		Scanner scanner = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			try {
				System.out.println("----Enter Aadhaar Number---");
				String ano = scanner.next();
				Pattern p = Pattern.compile("[0-9]{4}-[0-9]{4}-[0-9]{4}");
				Matcher matcher = p.matcher(ano);
				boolean matches = matcher.matches();

				if (matches) {
					System.out.println("--Aadhaar Numeber is valid---");
					flag = false;
				} else {
					System.out.println(
							"--Aadhaar Numeber is invalid--please Enter valid aadhaar number in 1111-1111-1111 fromat");
				}
			} catch (Exception e) {
				System.err.println(e);
			}
		}
	}

}
