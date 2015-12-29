<div class="sidebar" id="sidebar">
    <script type="text/javascript">
        try {
            ace.settings.check('sidebar', 'fixed')
        } catch (e) {
        }
    </script>
<#if products??>
    <div class="sidebar-shortcuts" id="sidebar-shortcuts">
        <div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
            <!--<h5 class="blue"><Strong>${menus[0].title_menu}</Strong></h5> -->

            <div class="btn-group">
                <button data-toggle="dropdown" class="btn btn-light dropdown-toggle col-xs-12"
                        id="producted" product="yudian">
                    当前产品:<@shiro.hasPermission name="product:yudian">语点</@shiro.hasPermission>
                    <span class="icon-caret-down icon-on-right"></span>
                </button>

                <ul class="dropdown-menu dropdown-info pull-left">

                    <#if product?exists>
                        <#list product?keys as key>
                            <@shiro.hasPermission name="product:${key}">
                                <li>
                                    <a href="#" class="product" product="${key}">${product[key]}</a>
                                </li>
                            </@shiro.hasPermission>
                        </#list>
                    </#if>

                <#--<@shiro.hasPermission name="product:yudian">
                    <li>
                        <a href="#" class="product" product="yudian">语点</a>
                    </li>
                </@shiro.hasPermission>
                <@shiro.hasPermission name="product:lingxi">
                    <li>
                        <a href="#" class="product" product="lingxi">灵犀</a>
                    </li>
                </@shiro.hasPermission>
                <@shiro.hasPermission name="product:xiaomi">
                    <li>
                        <a href="#" class="product" product="xiaomi">小米</a>
                    </li>
                </@shiro.hasPermission>
                <@shiro.hasPermission name="product:xiaomi3.0">
                    <li>
                        <a href="#" class="product" product="xiaomi3.0">小米3.0</a>
                    </li>
                </@shiro.hasPermission>
                <@shiro.hasPermission name="product:oppo">
                    <li>
                        <a href="#" class="product" product="oppo">oppo</a>
                    </li>
                </@shiro.hasPermission>
                <@shiro.hasPermission name="product:hw">
                    <li>
                        <a href="#" class="product" product="hw">华为</a>
                    </li>
                </@shiro.hasPermission>
                <@shiro.hasPermission name="product:mz">
                    <li>
                        <a href="#" class="product" product="mz">魅族</a>
                    </li>
                </@shiro.hasPermission>
                <@shiro.hasPermission name="product:zx">
                    <li>
                        <a href="#" class="product" product="zx">中兴</a>
                    </li>
                </@shiro.hasPermission>
                <@shiro.hasPermission name="product:bbk">
                    <li>
                        <a href="#" class="product" product="bbk">步步高</a>
                    </li>
                </@shiro.hasPermission>
                <@shiro.hasPermission name="product:tcl">
                    <li>
                        <a href="#" class="product" product="tcl">TCL</a>
                    </li>
                </@shiro.hasPermission>
                <@shiro.hasPermission name="product:ty">
                    <li>
                        <a href="#" class="product" product="ty">天语</a>
                    </li>
                </@shiro.hasPermission>
                <@shiro.hasPermission name="product:dkl">
                    <li>
                        <a href="#" class="product" product="dkl">大可乐</a>
                    </li>
                </@shiro.hasPermission>-->
                    <li class="divider"></li>
                </ul>
            </div>
            <!-- /btn-group -->

        </div>

        <div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
            <span class="btn btn-success"></span>

            <span class="btn btn-info"></span>

            <span class="btn btn-warning"></span>

            <span class="btn btn-danger"></span>
        </div>
    </div>
    <!-- #sidebar-shortcuts -->
</#if>
    <ul class="nav nav-list">

    <#list menus as menu>

        <li <#if basePage.title == '${menu.parent_menu[1]}'>class="active open"</#if>>
            <a href="#" class="dropdown-toggle">
                <i class='${menu.parent_menu[2]}'></i>
                <span class="menu-text"> ${menu.parent_menu[0]} </span>

                <b class="arrow icon-angle-down"></b>
            </a>

            <ul class="submenu">
                <#list menu.child_menu?keys as childname>
                    <@shiro.hasPermission name="${menu.child_menu[childname][2]}" >
                        <li <#if basePage.menu == '${menu.child_menu[childname][1]}'>class="active"</#if>>
                            <a href="<@c.url value='${menu.child_menu[childname][0]}'/>">
                                <i class="icon-double-angle-right"></i>
                            ${childname}
                            </a>
                        </li>
                    </@shiro.hasPermission>
                </#list>
            </ul>
        </li>


    </#list>
    </ul>
    <!-- /.nav-list -->

    <div class="sidebar-collapse" id="sidebar-collapse">
        <i class="icon-double-angle-left" data-icon1="icon-double-angle-left"
           data-icon2="icon-double-angle-right"></i>
    </div>

    <script type="text/javascript">

        try {
            ace.settings.check('sidebar', 'collapsed')
        } catch (e) {
        }

        $(".submenu").each(function () {

            if ($(this).find("li").length == 0) {
                $(this).parent().hide();
            } else {
                $(this).parent().show();
            }
        });

        function getCookie(name)//取cookies函数
        {
            var arr = document.cookie.match(new RegExp("(^| )" + name + "=([^;]*)(;|$)"));
            if (arr != null) return unescape(arr[2]);
            return null;

        }

        $(document).on('click', '.product', function () {
            var product = $(this).attr("product");
            var text = $(this).text().trim();
            $("#producted").attr("product", product);
            $("#producted").text("当前产品:" + text);
            $("#producted").append("<span class='icon-caret-down icon-on-right'></span>");
            SetCookie("product", product);
            SetCookie("text", text);
        });
        product = getCookie("product");
        text = getCookie("text");
        if (product != null && text != null) {
            $("#producted").attr("product", product);
            $("#producted").text("当前产品:" + text);
            $("#producted").append("<span class='icon-caret-down icon-on-right'></span>");
        }

        if ($("#producted").text().trim() == '当前产品:') {
            $("#producted").attr("product", $(".product").attr("product").trim());
            $("#producted").text("当前产品:" + $(".product")[0].text.trim());
            $("#producted").append("<span class='icon-caret-down icon-on-right'></span>");
        }
    </script>
</div>
