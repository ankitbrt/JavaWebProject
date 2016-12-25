
	import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

	public class JAXBExample {
		public static void main(String[] args) {

		 try {

			File file = new File("D:\\JavaBatch\\Project1\\JavaWebProject\\Test1\\src\\employees.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Employees customer = (Employees) jaxbUnmarshaller.unmarshal(file);
			for(Employee employee:customer.getEmployees())
				System.out.println(employee);

		  } catch (JAXBException e) {
			e.printStackTrace();
		  }

		}
	}
