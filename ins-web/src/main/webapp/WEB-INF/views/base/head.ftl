<div class="navbar navbar-default" id="navbar">

    <div class="navbar-container" id="navbar-container">
        <div class="navbar-header pull-left">
            <a href="#" class="navbar-brand">
                <small>
                    <i class="icon-cloud"></i>
                ${menus[0].title_menu}
                </small>
            </a><!-- /.brand -->
        </div>
        <!-- /.navbar-header -->

        <div class="pull-right navbar-header" role="navigation">
            <ul class="nav ace-nav">


                <li class="light-blue">
                    <a href="<@c.url value='/'/>">
                        主页
                    </a>
                </li>

                <!-- 选择环境自动化发布定制 -->
            <#if basePage.selectDeploy ??>
                <li class="light-blue pull-right">
                    <a data-toggle="dropdown" href="#" class="dropdown-toggle" id="env-info">
                        <i class="icon-caret-down"></i>
                        测试环境
                    </a>

                    <ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
                        <@shiro.hasPermission name="buildenv:dev">
                            <li>
                                <a href="#" onclick="select('dev')">
                                    <i class="icon-user"></i>
                                    开发环境
                                </a>
                            </li>
                        </@shiro.hasPermission>
                        <@shiro.hasPermission name="buildenv:test">
                            <li>
                                <a href="#" onclick="select('test')">
                                    <i class="icon-user"></i>
                                    测试环境
                                </a>
                            </li>
                        </@shiro.hasPermission>
                        <@shiro.hasPermission name="buildenv:onlinepre">
                            <li>
                                <a href="#" onclick="select('onlinepre')">
                                    <i class="icon-user"></i>
                                    准上线环境
                                </a>
                            </li>
                        </@shiro.hasPermission>
                        <@shiro.hasPermission name="buildenv:online">
                            <li>
                                <a href="#" onclick="select('online')">
                                    <i class="icon-user"></i>
                                    线上环境
                                </a>
                            </li>
                        </@shiro.hasPermission>
                        <@shiro.hasPermission name="buildenv:lx">
                            <li>
                                <a href="#" onclick="select('lx')">
                                    <i class="icon-user"></i>
                                    灵犀云环境
                                </a>
                            </li>
                        </@shiro.hasPermission>
                        <li class="divider"></li>
                    </ul>
                </li>
            </#if>
                <!-- 选择环境自动化发布定制 -->

                <!-- 选择环境语义测试环境发布定制 -->
            <#if basePage.selectNluDeploy ??>
                <li class="light-blue pull-right">
                    <a data-toggle="dropdown" href="#" class="dropdown-toggle" id="testenv-info">
                        <i class="icon-caret-down"></i>
                        语义测试环境
                    </a>

                    <ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
                        <@shiro.hasPermission name="buildenv:nlutest">
                            <li>
                                <a href="#" onclick="selectNlu('nluTest')">
                                    <i class="icon-user"></i>
                                    语义测试环境
                                </a>
                            </li>
                        </@shiro.hasPermission>
                        <@shiro.hasPermission name="buildenv:tvtest">
                            <li>
                                <a href="#" onclick="selectNlu('tvTest')">
                                    <i class="icon-user"></i>
                                    电视下移测试环境
                                </a>
                            </li>
                        </@shiro.hasPermission>
                        <li class="divider"></li>
                    </ul>
                </li>
            </#if>
                <!-- 选择环境语义测试环境发布定制结束  -->

                <li class="light-blue pull-right">
                    <a data-toggle="dropdown" href="#" class="dropdown-toggle">
								<span class="user-info">
									<small>欢迎,</small>
                                ${user.username}

								</span>

                        <i class="icon-caret-down"></i>
                    </a>

                    <ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">

                        <li>
                            <a href="#">
                                <i class="icon-user"></i>
                                用户设置
                            </a>
                        </li>

                        <li class="divider"></li>

                        <li>
                            <a href="<@c.url value='/logout'/>">
                                <i class="icon-off"></i>
                                退出登录
                            </a>
                        </li>
                    </ul>
                </li>
            </ul>
            <!-- /.ace-nav -->
        </div>
        <!-- /.navbar-header -->
    </div>
    <!-- /.container -->
    <script type="text/javascript">
        try {
            ace.settings.check('navbar', 'fixed')
        } catch (e) {
        }
        function select(env) {
            SetCookie("buildenv", env);
            location.reload();
        }

        function selectNlu(env) {
            SetCookie("buildNluenv", env);
            location.reload();
        }

        $(document).ready(function () {
            var env = getCookie("buildenv");
            if (env == "dev") {
                $("#env-info").empty();
                $("#env-info").append("<i class=\"icon-caret-down\"></i>开发环境");
            } else if (env == "test") {
                $("#env-info").empty();
                $("#env-info").append("<i class=\"icon-caret-down\"></i>测试环境");
            } else if (env == "onlinepre") {
                $("#env-info").empty();
                $("#env-info").append("<i class=\"icon-caret-down\"></i>准上线环境");
            } else if (env == "online") {
                $("#env-info").empty();
                $("#env-info").append("<i class=\"icon-caret-down\"></i>线上环境");
            } else if (env == "lx") {
                $("#env-info").empty();
                $("#env-info").append("<i class=\"icon-caret-down\"></i>灵犀云环境");
            }
            var nluenv = getCookie("buildNluenv");
            if(nluenv == "nluTest"){
                $("#testenv-info").empty();
                $("#testenv-info").append("<i class=\"icon-caret-down\"></i>语义测试环境");
            } else if(nluenv == "tvTest"){
                $("#testenv-info").empty();
                $("#testenv-info").append("<i class=\"icon-caret-down\"></i>电视下移测试环境");
            }

        });
    </script>
</div>
