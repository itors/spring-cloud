package com.asiainfo.filter;


import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class ZuulFilterPre extends ZuulFilter{

	private Logger logger = Logger.getLogger(ZuulFilterPre.class);
	
	@Override
	public Object run() {
		RequestContext reqCtx = RequestContext.getCurrentContext();
		reqCtx.getResponse().setContentType("application/json;charset=utf-8");
		HttpServletRequest req = reqCtx.getRequest();
		Object objAccessToken = req.getParameter("accesstoken");
		if(objAccessToken==null||objAccessToken.toString().equals("")){
			logger.debug("Accesstoken is null");
			reqCtx.setSendZuulResponse(false);
			reqCtx.setResponseStatusCode(401);
			logger.debug("Zuul Filter:"+req.getRequestURI());
			reqCtx.setResponseBody("{\"reCode\":2,\"reMsg\":\"没有accesstoken\"}");
			return null;
		}
		logger.debug("Accesstoken is ok");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
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
		return "pre";
	}

}
