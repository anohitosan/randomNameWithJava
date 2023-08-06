package randomNameWithJava.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import randomNameWithJava.model.domain.MstMember;

@Mapper
public interface MstMemberMapper {

	@Select(value="SELECT * FROM mst_member")
	List<MstMember> find();
	
	@Insert(value="INSERT INTO mst_member(family_name,first_name) VALUES (#{familyName},#{firstName})")
	int addName(String familyName,String firstName);
	
	@Delete(value="DELETE FROM mst_member ORDER BY id DESC LIMIT 1")
	int deleteLastName();
}
