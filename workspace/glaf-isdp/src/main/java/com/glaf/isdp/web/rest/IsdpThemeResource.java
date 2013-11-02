package com.glaf.isdp.web.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.springframework.stereotype.Controller;

import com.glaf.core.util.RequestUtils;

@Controller
@Path("/rs/isdp/theme")
public class IsdpThemeResource {

	@POST
	@Path("/set")
	public void setTheme(@Context HttpServletRequest request,
			@Context HttpServletResponse response, @Context UriInfo uriInfo) {
		RequestUtils.setTheme(request, response);
	}

}
