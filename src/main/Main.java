package main;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;

import main.converter.CsvConverter;

public class Main {

	public static void main(String[] args) throws URISyntaxException {

		CsvConverter converter = new CsvConverter();

		final String path = Paths.get(Main.class.getResource("/test.csv").toURI()).toString();

		try {

			System.out.println(converter.convertToListStudent(path));

		} catch (IOException e) {

			System.out.println("Ne fonctionne pas !");

		}

	}

}
