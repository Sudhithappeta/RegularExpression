package com.pennant;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AadhaarNameValidation {

	public static void nameValidation() {
		Scanner scanner = new Scanner(System.in);

		boolean flag = true;

		while (flag) {
			try {
				Pattern compile = Pattern.compile("[A-Za-z\\s]{4,20}");

				System.out.println("Enter Adhaar name:");
				String name = scanner.nextLine();
				Matcher matcher = compile.matcher(name);

				boolean matches = matcher.matches();
				if (matches) {
					System.out.println("--Aadhaar Name is Valid--" + name);
					flag = false;
				} else {
					System.out.println(
							"--Aadhaar Name is invalid-- Number/spical charcters are not allowed--charcters" + name);

				}
			} catch (Exception e) {
				System.err.println(e);
			}
		}
	}
}
