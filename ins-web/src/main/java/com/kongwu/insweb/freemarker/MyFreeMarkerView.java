package com.kongwu.insweb.freemarker;

import com.kongwu.insweb.utils.Constants;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Administrator on 2015/12/30 0030.
 */
public class MyFreeMarkerView extends FreeMarkerView {
    @Override
    protected void exposeHelpers(Map<String, Object> model,
                                 HttpServletRequest request) throws Exception {
        model.put(Constants.CONTEXT_PATH, request.getContextPath());
        super.exposeHelpers(model, request);
    }
}
