package randomNameWithJava.model.domain;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class MstMember {
	private int id;
	private String familyName;
	private String firstName;
	private Timestamp createdAt;
	private Timestamp updateAt;
}
