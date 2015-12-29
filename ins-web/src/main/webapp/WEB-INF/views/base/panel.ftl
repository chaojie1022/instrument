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
            </div>
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
</script>
