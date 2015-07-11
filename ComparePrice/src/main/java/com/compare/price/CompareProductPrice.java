package com.compare.price;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/compare")
public class CompareProductPrice {

	@RequestMapping(method = RequestMethod.GET)
	public String priceCompare() {
		return ControllerConstant.COMPARE_VIEW;
	}

}
