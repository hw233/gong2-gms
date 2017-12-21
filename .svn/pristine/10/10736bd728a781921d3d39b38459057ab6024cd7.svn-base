var OperationManager = function () {

    var handleDateRangePickers = function () {
        if (!jQuery().daterangepicker) {
            return;
        }

        $('#defaultrange').daterangepicker({
                opens: (App.isRTL() ? 'left' : 'right'),
                format: 'YYYY/MM/DD',
                separator: ' to ',
                minDate: '1979/01/01',
                maxDate: '2099/01/01',
                ranges: {
                    '今天': [moment(), moment().add('days', 1)],
                    '最近2天': [moment().subtract('days', 1), moment().add('days', 1)],
                    '最近3天': [moment().subtract('days', 2), moment().add('days', 1)],
                    '最近7天': [moment().subtract('days', 6), moment().add('days', 1)],
                    '最近30天': [moment().subtract('days', 29), moment().add('days', 1)]
                 },
                 locale: {
                     applyLabel: '确认',
                     fromLabel: '从',
                     toLabel: '到',
                     customRangeLabel: '自定义',
                     daysOfWeek: ['日', '一', '二', '三', '四', '五', '六'],
                     monthNames: ['一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月'],
                     firstDay: 1
                 }
            },
            function (start, end) {
                console.log("Callback has been called!");
                $('#defaultrange input').val(start.format('YYYY/MM/DD') + '-' + end.format('YYYY/MM/DD'));
            }
        );        
    }
    
    var qryAndExpBind = function() {
    	function dosearch(e) {
			e.preventDefault();
			
			$('#mainform').attr("target", "");
			$('#mainform').attr("action", $('#mainform').attr("actionlist"));
	  		$('#mainform').submit();
		}
		$("#searchbtn").click(dosearch);
		
		function doexport(e) {
			e.preventDefault();
			
	  		$('#mainform').attr("target", "_blank");
			$('#mainform').attr("action", $('#mainform').attr("actionexport"));
	  		$('#mainform').submit();
		}
		$("#exporterbtn").click(doexport);
    }

    return {
        init: function () {
            handleDateRangePickers();
            qryAndExpBind();
        }
    };

}();