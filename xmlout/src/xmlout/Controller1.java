package xmlout;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;



public class Controller1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Controller1 con=new Controller1();
		ebel eb=new ebel(11, "edd", 30);
		
		con.marsel(eb);
	}

	public void marsel(ebel eb) {
		
		JAXBContext jax;
		
		StringBuilder st = null;
		try {
			jax = JAXBContext.newInstance(ebel.class);
			
			Marshaller mar=jax.createMarshaller();
			
			
			mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			mar.marshal(eb, new File("ub.txt"));
			
			System.out.println(st.toString());
			
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
