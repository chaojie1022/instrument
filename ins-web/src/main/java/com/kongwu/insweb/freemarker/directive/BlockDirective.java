package com.kongwu.insweb.freemarker.directive;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

import java.io.IOException;
import java.util.Map;

public class BlockDirective implements TemplateDirectiveModel {
    public final static String DIRECTIVE_NAME = "block";

    public void execute(Environment env, @SuppressWarnings("rawtypes") Map params,
                        TemplateModel[] loopVars, TemplateDirectiveBody body)
        throws TemplateException, IOException {
        String name = DirectiveUtils.getRequiredParam(params, "name");
        TemplateDirectiveBodyOverrideWraper overrideBody =
            DirectiveUtils.getOverrideBody(env, name);
        if (overrideBody == null) {
            if (body != null) {
                body.render(env.getOut());
            }
        } else {
            DirectiveUtils
                .setTopBodyForParentBody(env, new TemplateDirectiveBodyOverrideWraper(body, env),
                    overrideBody);
            overrideBody.render(env.getOut());
        }
    }
}
