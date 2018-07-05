package com.asiainfo.filter;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class ZuulFilterError extends ZuulFilter{
	
	private Logger logger = Logger.getLogger(ZuulFilterError.class);
	
	@Override
	public Object run() {
		RequestContext reqCtx = RequestContext.getCurrentContext();
		reqCtx.getResponse().setContentType("application/json;charset=utf-8");
		HttpServletRequest req = reqCtx.getRequest();
		reqCtx.setSendZuulResponse(false);
		reqCtx.setResponseStatusCode(401);
		logger.debug("Zuul Filter:"+req.getRequestURI());
		reqCtx.setResponseBody("{\"reCode\":3,\"reMsg\":\"Zuul error\"}");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	/**
	 * pre：进行路由前调用； 
	 * routing：进行路由的时候调用； 
	 * error：发生错误时调用； 
	 * post：routing&error之后调用；
	 */
	@Override
	public String filterType() {
		return "error";
	}

}
