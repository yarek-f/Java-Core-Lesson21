package lviv.lgs.ua.annotation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;

public class Application {

	public static void main(String[] args) throws IOException {
		
		annotationFieldsToFile(Clothes.class);		

	}
	
public static void annotationFieldsToFile(Class<?> currentClass) throws IOException {
		
		Field[] fields = currentClass.getDeclaredFields();

		File fileTextFields = new File("textFields.txt");

		Writer wr = new FileWriter(fileTextFields);
		for (int i = 0; i < fields.length; i++) {
			if(fields[i].getAnnotation(ClothesForEveryday.class)!=null) 
				wr.write(fields[i].getName()+"\n");
		}
		wr.close();
		
	}

}
