<#macro base_js>
<!--[if !IE]> -->
<script type="text/javascript" src="<@c.url value='/static/js/ace/jquery.min.js' />"></script>
<!-- <![endif]-->
<!--[if IE]>
<script type="text/javascript" src="<@c.url value='/static/js/ace/jquery-1.10.2.min.js' />"></script>
<![endif]-->
<!--[if !IE]> -->
<script type="text/javascript">
    window.jQuery || document.write("<script src='/static/js/ace/jquery-2.0.3.min.js'>"+"<"+"/script>");
</script>
<!-- <![endif]-->
<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='/static/js/ace/jquery-1.10.2.min.js'>"+"<"+"/script>");
</script>
<![endif]-->
<script type="text/javascript">
    if("ontouchend" in document) document.write("<script src='/static/js/ace/jquery.mobile.custom.min.js'>"+"<"+"/script>");
</script>
<script type="text/javascript" src="<@c.url value='/static/js/ace/bootstrap.min.js' />"></script>
<script type="text/javascript" src="<@c.url value='/static/js/ace/typeahead-bs2.min.js' />"></script>
<!-- page specific plugin scripts -->
<!-- ace scripts -->
<script type="text/javascript" src="<@c.url value='/static/js/ace/ace-elements.min.js' />"></script>
<script type="text/javascript" src="<@c.url value='/static/js/ace/ace.min.js' />"></script>
<!-- inline scripts related to this page -->
<script type="text/javascript" src="<@c.url value='/static/js/ace/ace-extra.min.js' />"></script>
<script type="text/javascript" src="<@c.url value='/static/js/ace/spin.min.js' />"></script>
<script type="text/javascript" src="<@c.url value='/static/js/ace/bootbox.min.js' />"></script>
<script type="text/javascript" src="<@c.url value='/static/js/ace/jquery.gritter.min.js' />"></script>
<script type="text/javascript" src="<@c.url value='/static/js/common/jquery.json.min.js' />"></script>
<script type="text/javascript" src="<@c.url value='/static/js/ace/bootstrap-tag.min.js' />"></script>
<script type="text/javascript" src="<@c.url value='/static/js/ace/jquery-ui-1.10.3.custom.min.js' />"></script>
<script type="text/javascript" src="<@c.url value='/static/js/ace/jquery.ui.touch-punch.min.js' />"></script>
<script src="<@c.url value='/static/js/ace/fuelux.wizard.min.js'/>"></script>
<script type="text/javascript" src="<@c.url value='/static/js/common/template.js' />"></script>
<script type="text/javascript" src="<@c.url value='/static/layer/layer.js' />"></script>
<script type="text/javascript" src="<@c.url value='/static/layer/extend/layer.ext.js' />"></script>
<script type="text/javascript" src="<@c.url value='/static/js/common/common.js' />"></script>
<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
<script type="text/javascript" src="<@c.url value='/static/js/ace/html5shiv.js' />"></script>
<script type="text/javascript" src="<@c.url value='/static/js/ace/respond.min.js' />"></script>
<![endif]-->
<script type="text/javascript">
    var Global = {
        webRoot : "${rc.getContextPath()}"
    };
</script>
</#macro>

<#macro highCharts>
<script type="text/javascript" src="<@c.url value='/static/js/chart/highcharts.js'/>"></script>
<script type="text/javascript" src="<@c.url value='/static/js/chart/gri.chart.js'/>"></script>
</#macro>


<#macro common_js>
<script type="text/javascript" src="<@c.url value='/static/js/common/common.js' />"></script>
</#macro>

<#macro dataTables>
<script type="text/javascript" src="<@c.url value='/static/js/ace/jquery.dataTables.min.js' />"></script>
<script type="text/javascript" src="<@c.url value='/static/js/ace/jquery.dataTables.bootstrap.js' />"></script>
</#macro>

<#macro table_js>
<script type="text/javascript" src="<@c.url value='/static/js/common/table.js' />"></script>
</#macro>

<#macro dataTables_export>
<script src="<@c.url value='/static/js/ace/TableTools.min.js'/>" charset="utf-8" type="text/javascript" /></script>
<link rel="stylesheet" href="<@c.url value='/static/css/ace/TableTools.css'/>" charset="utf-8"/>
        <link rel="stylesheet" href="<@c.url value='/static/css/ace/TableTools_JUI.css'/>" charset="utf-8"/>
</#macro>

<#macro reset>
        <link rel="stylesheet" href="<@c.url value='/static/css/reset.css'/>"/>
</#macro>

<#macro time>
        <link rel="stylesheet" href="<@c.url value='/static/css/ace/datepicker.css'/>"/>
        <script type="text/javascript" src="<@c.url value='/static/js/date-time/bootstrap-datepicker.min.js'/>"></script>
<script type="text/javascript" src="<@c.url value='/static/js/date-time/moment.min.js' />"></script>
</#macro>

<#macro pdfobject>
<script type="text/javascript" src="<@c.url value='/static/pdfobject/pdfobject.js'/>"></script>
</#macro>

<#macro time2>
<script type="text/javascript" src="<@c.url value='/static/js/date-time/bootstrap-datetimepicker.min.js'/>"></script>
<script type="text/javascript" src="<@c.url value='/static/js/date-time/bootstrap-datetimepicker.pt-BR.js'/>"></script>
<link rel="stylesheet" href="<@c.url value='/static/js/date-time/bootstrap-datetimepicker.min.css'/>"/>
</#macro>

<#macro timerange>
<link rel="stylesheet" href="<@c.url value='/static/css/ace/daterangepicker.css'/>"/>
<script type="text/javascript" src="<@c.url value='/static/js/date-time/moment.min.js'/>"></script>
<script type="text/javascript" src="<@c.url value='/static/js/date-time/daterangepicker.min.js'/>"></script>
</#macro>


<#macro treetable>
<link rel="stylesheet" href="<@c.url value='/static/treetable/jquery.treetable.css'/>"/>
<link rel="stylesheet" href="<@c.url value='/static/treetable/jquery.treetable.theme.default.css'/>"/>
<script type="text/javascript" src="<@c.url value='/static/treetable/jquery.treetable.js'/>"></script>
</#macro>

<#macro ztree>
<link rel="stylesheet" href="<@c.url value='/static/zTree/zTreeStyle.css'/>"/>
<script type="text/javascript" src="<@c.url value='/static/zTree/jquery.ztree.core-3.5.js'/>"></script>
<script type="text/javascript" src="<@c.url value='/static/zTree/jquery.ztree.excheck-3.5.js'/>"></script>
</#macro>

<#macro chosen>
<script type="text/javascript" src="<@c.url value='/static/js/ace/chosen.jquery.min.js'/>"></script>
</#macro>

<#macro validate>
<script type="text/javascript" src="<@c.url value='/static/js/ace/jquery.validate.min.js'/>"></script>
<script type="text/javascript" src="<@c.url value='/static/js/ace/jquery.validate.method.js'/>"></script>
</#macro>

<#macro select2>
<link rel="stylesheet" href="<@c.url value='/static/select2/select2-bootstrap.css'/>"/>
<link rel="stylesheet" href="<@c.url value='/static/select2/select2.css'/>"/>
<script type="text/javascript" src="<@c.url value='/static/select2/select2.min.js'/>"></script>
</#macro>

<#macro backtop>
<link rel="stylesheet" href="<@c.url value='/static/backtop/zzsc.css'/>"/>
<script type="text/javascript" src="<@c.url value='/static/backtop/zzsc.js'/>"></script>
</#macro>

<#macro log>
<link rel="stylesheet" href="<@c.url value='/static/js/log/search.css'/>"/>
<script type="text/javascript" src="<@c.url value='/static/js/log/search.js'/>"></script>
</#macro>

<#macro jumplog>
<link rel="stylesheet" href="<@c.url value='/static/js/log/search.css'/>"/>
<script type="text/javascript" src="<@c.url value='/static/js/log/jump.js'/>"></script>
</#macro>

<#macro reclog>
<link rel="stylesheet" href="<@c.url value='/static/js/log/search.css'/>"/>
<script type="text/javascript" src="<@c.url value='/static/js/log/rec.js'/>"></script>
</#macro>

<#macro isaplog>
<link rel="stylesheet" href="<@c.url value='/static/js/log/search.css'/>"/>
<script type="text/javascript" src="<@c.url value='/static/js/log/isap.js'/>"></script>
</#macro>

<#macro timeoutlog>
<link rel="stylesheet" href="<@c.url value='/static/js/log/search.css'/>"/>
<script type="text/javascript" src="<@c.url value='/static/js/log/timeout.js'/>"></script>
</#macro>

<#macro export>
<link rel="stylesheet" href="<@c.url value='/static/js/export/log.css'/>"/>
<script type="text/javascript" src="<@c.url value='/static/js/export/log.js'/>"></script>
</#macro>

<#macro collapse>
<link rel="stylesheet" href="<@c.url value='/static/css/ace/jquery-ui-1.10.3.full.min.css'/>"/>
<script type="text/javascript" src="<@c.url value='/static/js/ace/typeahead-bs2.min.js'/>"></script>
<script type="text/javascript" src="<@c.url value='/static/js/ace/jquery-ui-1.10.3.full.min.js'/>"></script>
<script type="text/javascript" src="<@c.url value='/static/js/ace/jquery.ui.touch-punch.min.js'/>"></script>
</#macro>

<#macro jsoneditor>
<link rel="stylesheet" href="<@c.url value='/static/json/jsoneditor.css'/>"/>
<script type="text/javascript" src="<@c.url value='/static/json/jsoneditor.js'/>"></script>
<script type="text/javascript" src="<@c.url value='/static/json/ace.js'/>"></script>
<script type="text/javascript" src="<@c.url value='/static/json/mode-json.js'/>"></script>
<script type="text/javascript" src="<@c.url value='/static/json/theme-textmate.js'/>"></script>
<script type="text/javascript" src="<@c.url value='/static/json/theme-jsoneditor.js'/>"></script>
<script type="text/javascript" src="<@c.url value='/static/json/jsonlint.js'/>"></script>
</#macro>

<#macro dropzone>
<script type="text/javascript" src="<@c.url value='/static/js/ace/dropzone.min.js'/>"></script>
</#macro>
<#macro plupload>
<script type="text/javascript" src="<@c.url value='/static/plupload/plupload.full.min.js'/>"></script>
</#macro>
<#macro knob>
<script type="text/javascript" src="<@c.url value='/static/js/ace/jquery.knob.min.js'/>"></script>
</#macro>
<#macro umeditor>
<link rel="stylesheet" href="<@c.url value='/static/umeditor/themes/default/css/umeditor.min.css'/>">
<script type="text/javascript"
        src="<@c.url value='/static/umeditor/umeditor.config.js'/>"></script>
<script type="text/javascript"
        src="<@c.url value='/static/umeditor/umeditor.js'/>"></script>
</#macro>
<#macro baseStyle>
<link rel="stylesheet" href="<@c.url value='/static/css/ace/bootstrap.min.css'/>"/>
<link rel="stylesheet" href="<@c.url value='/static/css/ace/font-awesome.min.css'/>"/>
<!--[if IE 7]>
<link rel="stylesheet" href="<@c.url value='/static/css/ace/font-awesome-ie7.min.css'/>"/>
<![endif]-->

<!-- page specific plugin styles -->

<!-- fonts -->

<link rel="stylesheet" href="<@c.url value='/static/css/ace/fonts.css'/>"/>
<!-- ace styles -->
<link rel="stylesheet" href="<@c.url value='/static/css/ace/chosen.css'/>"/>
<link rel="stylesheet" href="<@c.url value='/static/css/ace/dropzone.css'/>"/>
<link rel="stylesheet" href="<@c.url value='/static/css/ace/ace.min.css'/>"/>
<link rel="stylesheet" href="<@c.url value='/static/css/ace/ace-rtl.min.css'/>"/>
<link rel="stylesheet" href="<@c.url value='/static/css/ace/ace-skins.min.css'/>"/>
<link rel="stylesheet" href="<@c.url value='/static/css/ace/jquery-ui-1.10.3.custom.min.css'/>"/>
<link rel="stylesheet" href="<@c.url value='/static/css/ace/ace-responsive.min.css'/>"/>
<link rel="stylesheet" href="<@c.url value='/static/css/ace/jquery.gritter.css'/>"/>
<link rel="stylesheet" href="<@c.url value='/static/layer/skin/layer.css'/>"/>
<link rel="stylesheet" href="<@c.url value='/static/layer/skin/layer.ext.css'/>"/>

<!--[if lte IE 8]>
<![endif]-->

</#macro>
<#macro td_break>
<style type="text/css">
td
{
  word-break: break-all;/*必须*/
}
</style>
</#macro>

<#macro ajaxupload>
<script type="text/javascript" src="<@c.url value='/static/js/ajaxupload/ajaxfileupload.js'/>"></script>
</#macro>
<#--将文本中的换行符转为br-->
<#macro breakline plain>
    <#assign content = ""/>
${plain?replace("\n","<br/>")}
</#macro>
