package randomNameWithJava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import randomNameWithJava.model.domain.MstMember;
import randomNameWithJava.model.form.NameForm;
import randomNameWithJava.model.logic.ShuffleName;
import randomNameWithJava.model.mapper.MstMemberMapper;

@Controller
@RequestMapping("/randomNameWithJava")
public class IndexController {
	
	@Autowired
	private MstMemberMapper mstMemberMapper;

	@GetMapping("/")
	public String index(Model m) {
		List<MstMember> member = mstMemberMapper.find();
		m.addAttribute("member", member);
		return "index";
	}
	
	@GetMapping("/shuffle")
	public String shuffle (Model m) {
		List<MstMember> member = mstMemberMapper.find();
		ShuffleName.shuffle(member);
		m.addAttribute("member", member);
		return "index";
	}
	
	@GetMapping("/addName")
	public String addName(NameForm nf,Model m) {
		mstMemberMapper.addName(nf.getFamilyName(),nf.getFirstName());
		List<MstMember> member = mstMemberMapper.find();
		m.addAttribute("member", member);
		return "index";
	}
	
	@GetMapping("/deleteName")
	public String deleteName(Model m) {
		mstMemberMapper.deleteLastName();
		List<MstMember> member = mstMemberMapper.find();
		m.addAttribute("member", member);
		return "index";
	}
}
