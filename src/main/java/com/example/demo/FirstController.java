package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

//Important: to let spring boot work with jsp file, get tomcat jasper dependency
//so after start of spring boot app, type in: http://localhost:8095/index.jsp
//--> so you can access index.jsp without mapping a path

@Controller
public class FirstController {
	
	@RequestMapping("first")
	//use @RequestParam instead of HttpServletRequest
	public ModelAndView getFromFrontEnd(@RequestParam("sid") String sid, @RequestParam("sname") String sname) {
		System.out.println(sid);
		Student s1 = new Student();
		s1.setSid(Integer.parseInt(sid));
		s1.setSname(sname);
		
		ModelAndView mv = new ModelAndView();
		//see application.properties to config the viewresolver
		mv.setViewName("display"); //no need to add .jsp
		mv.addObject("studentobj",s1);
		
		return mv;
		
	}
	
	@RequestMapping("second")
	public int getLogic() {
		return 0;
	}

}
