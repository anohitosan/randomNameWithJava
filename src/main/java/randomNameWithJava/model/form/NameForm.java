package randomNameWithJava.model.form;

import java.io.Serializable;

import lombok.Data;

@Data
public class NameForm implements Serializable {
	private static final long serialVersionUID = 1L;
	private String familyName;
	private String firstName;
}
