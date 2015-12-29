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
        <div style="width:280px;margin-left: 15px;" id="panel">
            <div class="input-group" style="float: left;">
				<span class="input-group-addon">
					<i class="icon-calendar bigger-110"></i>
				</span>
                <input class="form-control date-picker" style="width:100px" type="text"
                       data-date-format="yyyy-mm-dd" id="date"
                       value="${StaticFunction.getDay()}"/>
				
				<span class="input-group-addon" id="selectrange">
					<a href="#" id="0" class="sd" style="text-decoration: none;color: black;">今天</a>
                    <a href="#" id="1" class="sd" style="text-decoration: none;">昨天</a>
					<a href="#" id="2" class="sd" style="text-decoration: none;">3天</a>
					<a href="#" id="3" class="sd" style="text-decoration: none;">4天</a>
					<a href="#" id="4" class="sd" style="text-decoration: none;">5天</a>
				</span>
            </div>
        </div>

    </div>
</div>

<script type="text/javascript">

    $('.date-picker').datepicker({autoclose: true}).next().on(ace.click_event, function () {
        $(this).prev().focus();
    });


    /**日期切换 */
    $(document).on(
            'click',
            '.sd',
            function () {
                $(".sd").css("color", "#428bca");
                $(this).css("color", "black");
                var AddDayCount = new Number($(this).attr("id"));
                var newDay = GetDateStr(-AddDayCount);
                $("#date").val(newDay);
            });

</script>
