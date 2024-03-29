package org.isobit.app;

import java.util.HashMap;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class AppExceptionMapper implements ExceptionMapper<Throwable> {
  
	@Override
	public Response toResponse(Throwable arg0) {
		HashMap m=new HashMap();
		arg0.printStackTrace();
		m.put("msg", arg0.getMessage());
		return Response
			.status(Response.Status.INTERNAL_SERVER_ERROR)
			.entity(m)
			.build();
	}
  //.contentType(MediaType.APPLICATION_OCTET_STREAM)
}
