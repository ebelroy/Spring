package xmlout;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ebel {
	
	private int slno;
	private String friends;
	private int age;
	
	public int getSlno() {
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
	}
	public String getFriends() {
		return friends;
	}
	public void setFriends(String friends) {
		this.friends = friends;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ebel(int slno, String friends, int age) {
		
		this.slno = slno;
		this.friends = friends;
		this.age = age;
	}
	public ebel() {
		//super();
	}
	
	

}
