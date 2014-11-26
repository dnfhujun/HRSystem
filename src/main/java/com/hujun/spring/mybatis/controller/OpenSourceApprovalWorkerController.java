/**
 * 
 */
package com.hujun.spring.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hujun.spring.mybatis.dao.OpensourceapprovalworkerMapper;

/**
 * @author Administrator
 *
 */
@Controller
public class OpenSourceApprovalWorkerController {

	@Autowired  
	private OpensourceapprovalworkerMapper opensourceapprovalworkerMapper;  
	      
    @RequestMapping(value = "index.do")  
    public void indexPage() {     
	   opensourceapprovalworkerMapper.insert(110);
	}   
}
