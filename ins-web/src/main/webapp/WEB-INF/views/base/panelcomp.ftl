<style type="text/css">
    .headpanel {
        padding-top: 5px;
    }

    .newpadding {
        padding: 0px;
    }

    .sd {
        margin: 3px;
    }
</style>

<div class="well headpanel col-sm-12">
    <div class="space-6"></div>

    <div class="row">
        <div style="width:420px;margin-left: 15px;" id="panel">
            <div class="input-group" style="float: left;">
				<span class="input-group-addon">
					<i class="icon-calendar bigger-110"></i>
				</span>
                <input class="form-control" style="width:180px" type="text" name="date-range-picker"
                       id="daterange" value="${StaticFunction.getTimeRange()}"/>
				
				<span class="input-group-addon" id="selectrange">
				<a href="#" id="0" class="sd" style="text-decoration: none;">今天</a>
				<a href="#" id="1" class="sd" style="text-decoration: none;">昨天</a>
				<a href="#" id="6" class="sd" style="text-decoration: none;color: black;">7天</a>
				<a href="#" id="13" class="sd" style="text-decoration: none;">14天</a>
				<a href="#" id="29" class="sd" style="text-decoration: none;">30天</a>
				</span>
				<span class="input-group-addon hidden" id="compare">
				  对比 
				</span>
            </div>
        </div>
        <div style="float: left;" id="date_compare" class="hidden">
            <input class="form-control" style="width:180px" type="text" name="date-range-picker"
                   id="datecomparerange" value="${StaticFunction.getCompareTimeRange()}"/>
        </div>
        <div style="float: left;">
            <button type="button" id="btn_compare" class="btn btn-sm btn-primary"
                    data-toggle="button" value="0">按时间对比
            </button>
        </div>
    </div>
</div>


<script type="text/javascript">
    $('input[name=date-range-picker]').daterangepicker({
        format: 'YYYY-MM-DD',
    }).prev().on(ace.click_event, function () {
        $(this).next().focus();
    });
    /**日期切换 */
    $(document).on(
            'click',
            '.sd',
            function () {
                $(".sd").css("color", "#428bca");
                $(this).css("color", "black");
                var AddDayCount = new Number($(this).attr("id"));
                if (AddDayCount == "1") {
                    var newDayRange = GetDateStr(-1) + " - " + GetDateStr(-1);
                    $("#daterange").val(newDayRange);
                    var Comparerange = GetDateStr(-2) + " - " + GetDateStr(-2);
                    $("#datecomparerange").val(Comparerange);
                } else {
                    var newDayRange = GetDateStr(-AddDayCount) + " - " + GetDateStr(0);
                    $("#daterange").val(newDayRange);
                    var Comparerange = GetDateStr(-2 * AddDayCount - 1) + " - " + GetDateStr(-AddDayCount - 1);
                    $("#datecomparerange").val(Comparerange);
                }
            });

    /** 对比日期 */
    $("#btn_compare").on("click", function () {
        var flag = $("#btn_compare").val();
        if (flag == "0") {
            $("#btn_compare").val("1");
            $("#btn_compare").text("取消对比");
            $("#panel").css("width", "180px");
            $("#selectrange").addClass("hidden");
            $("#compare").removeClass("hidden");
            $("#date_compare").removeClass("hidden");
        } else {
            $("#btn_compare").val("0");
            $("#btn_compare").text("按时间对比");
            $("#panel").css("width", "420px");
            $("#selectrange").removeClass("hidden");
            $("#compare").addClass("hidden");
            $("#date_compare").addClass("hidden");
        }

    });
</script>
