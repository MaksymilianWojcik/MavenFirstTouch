package akademiakodulombok;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public @Data class SomeData {
	
	private String name;
	private String lastname;
	private int age;
	
	
	@Getter
	private String nick1;
	
	@Setter
	private String nick;
	
	
}
