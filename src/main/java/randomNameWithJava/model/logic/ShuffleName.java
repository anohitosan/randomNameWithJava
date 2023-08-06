package randomNameWithJava.model.logic;

import java.util.Collections;
import java.util.List;

import randomNameWithJava.model.domain.MstMember;

public class ShuffleName {
	public static List<MstMember> shuffle(List<MstMember> member) {
		Collections.shuffle(member);
		return member;
	}
}
