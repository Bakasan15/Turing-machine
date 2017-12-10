import java.io.File;

import com.example.types.TuringCode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Parser {

	public static void main(String[] args) throws Exception {
		ObjectMapper om = new ObjectMapper();
		TuringCode tc = om.readValue(new File("src/resources/code/BusyBeaver.json"), TuringCode.class);
		
		System.out.println(tc.getStartState());

	}

}
