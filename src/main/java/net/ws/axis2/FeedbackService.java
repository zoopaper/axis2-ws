package net.ws.axis2;

import net.ws.model.Feedback;
import net.ws.model.Response;

/**
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/8/13
 * Time: 12:57
 */
public class FeedbackService {

    public Response resultFeedback(Feedback feedback) {
        Response response = new Response();
        response.setRetCode("000001");
        response.setRetResult("Axis2 is success !");
        return response;
    }

}
