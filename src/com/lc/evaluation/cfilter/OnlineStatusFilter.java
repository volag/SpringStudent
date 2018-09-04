package com.lc.evaluation.cfilter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.filter.OncePerRequestFilter;

import com.lc.evaluation.control.util.UserType;

/**
 * 检查登录状态
 */
public class OnlineStatusFilter extends OncePerRequestFilter {

	static Logger log = LogManager.getLogger(OnlineStatusFilter.class);

	private String excludedURL;

	private String[] excludeURLs;

	public void setExcludedURL(String excludedURL) {
		this.excludedURL = excludedURL;
		excludeURLs = excludedURL.split(";");
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String requestUrl = request.getServletPath();

		boolean isExclude = false;
		
		for (String urlMorde : excludeURLs) {
			if (requestUrl.matches(urlMorde)) {
				isExclude = true;
				filterChain.doFilter(request, response);
				return ;
			}
		}

		if (!isExclude) {
			if (request.getSession().getAttribute(UserType.userType) == null) {
				response.sendRedirect(request.getContextPath() + "/logout");
			}else{
				filterChain.doFilter(request, response);
			}
		} 
	}

}
