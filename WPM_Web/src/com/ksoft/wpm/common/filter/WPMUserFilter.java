package com.ksoft.wpm.common.filter;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ksoft.wpm.login.bsl.ILoginManager;


/**
 * Servlet Filter implementation class WPMUserFilter
 */
@WebFilter("*.do")
public class WPMUserFilter implements Filter {
	private final static Logger LOGGER = Logger.getLogger(WPMUserFilter.class.getName()); 
	
	@Autowired
	private ILoginManager loginManager;
	
    /**
     * Default constructor. 
     */
    public WPMUserFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		LOGGER.info("MyFilter......"+loginManager);		
		
		LOGGER.info("MyFilter......"+loginManager);
		request.setAttribute("home_user_name", "Basu");
		System.out.println(loginManager);

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
