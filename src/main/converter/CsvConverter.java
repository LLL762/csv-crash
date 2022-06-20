package main.converter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import main.model.Student;

public class CsvConverter {

	public List<Student> convertToListStudent(final String path) throws IOException {

		List<Student> output = new ArrayList<>();
		String line;
		String[] values;

		try (BufferedReader br = new BufferedReader(new FileReader(new File(path)))) {

			while ((line = br.readLine()) != null) {

				values = line.split(",");

				if (!isDataValid(values)) {

					throw new IOException("Invalid data!");
				}

				output.add(new Student(values[0], values[1], values[2], values[3], values[4]));

			}

		}
		return output;

	}

	private boolean isDataValid(String[] values) {

		return values.length == 5;

	}

}
