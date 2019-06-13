//package com.kaustubh;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.AbstractController;
// 
//public class HelloController extends AbstractController{
// 
//	@Override
//	protected ModelAndView handleRequestInternal(HttpServletRequest request,
//		HttpServletResponse response) throws Exception {
// 
//		ModelAndView modelandview = new ModelAndView("HelloPage");
//		modelandview.addObject("welcomeMessage", "Hi User, welcome to the first Spring MVC Application");
//		
//		return modelandview;
//	}
//}
package com.kaustubh;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

//	@RequestMapping("/welcome/{country}/{userName}")
//	public ModelAndView helloWorld(@PathVariable Map<String,String> params) {
////	public ModelAndView helloWorld(@PathVariable("userName") String name) {
//		String name=params.get("userName");
//		String country=params.get("country");
//		ModelAndView model = new ModelAndView("HelloPage");
//		model.addObject("msg","hello world"+name+country);
//
//		return model;
//	}
	
	@RequestMapping(value="/admissionForm",method = RequestMethod.GET)
	public ModelAndView admissionForm() {
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}
	
	@RequestMapping(value="/submitForm", method = RequestMethod.POST)
	public ModelAndView submitForm(@ModelAttribute("student1") Student student1)
//	public ModelAndView submitForm(@RequestParam Map <String,String> param)
	{
//		String name = param.get("name");
//		String pass = param.get("pass");
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","details:");
		return model;
	}

}