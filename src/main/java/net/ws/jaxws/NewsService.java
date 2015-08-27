package net.ws.jaxws;

import net.ws.model.News;
import net.ws.model.Response;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/8/13
 * Time: 16:30
 */
@WebService(name = "NewsService")
public class NewsService {

    @WebMethod
    public Response push(@WebParam(name = "news") News news) {
        Response response = new Response();
        response.setRetCode("000001");
        response.setRetResult("JAX-WS is Success!");
        return response;
    }

}
