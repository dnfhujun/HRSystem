/**
 * 
 */
package com.hujun.spring.mybatis.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hujun.spring.mybatis.dao.StudentMapper;
import com.hujun.spring.mybatis.model.Student;

/**
 * @author Administrator
 *
 */
@Controller
public class StudentController {
	@Autowired
	private StudentMapper studentMapper;

	@RequestMapping(value="insertStudent.do")
	public String insertStudent(Model model){
		Student st = new Student();
		st.setAge(11);
		st.setBirthday(new Date());
		st.setHeight(180);
		st.setName("hjboy");
		st.setSex(0);
		st.setCreateTime(new Date());
		int seqNo = studentMapper.insert(st);
		model.addAttribute("seqNo", seqNo);
		return "success";
	}
	
	@RequestMapping(value="json")
	public @ResponseBody Student returnJson(HttpServletRequest req){
		Student sd = new Student();
		sd.setAge(11);
		sd.setName("xxx");
		return sd;
	}
	
	@RequestMapping(value="json1")
	public @ResponseBody Map<String,Object> returnJson1(HttpServletRequest req){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("msg", "0k");
		Student sd = new Student();
		sd.setAge(11);
		sd.setName("xxx");
		map.put("student", sd);
		return map;
	}
}
