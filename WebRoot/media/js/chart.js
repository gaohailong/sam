function as_linechart() {
	$.ajax({
		type : "GET",
		url : "/admin/selectAllTitleForChart",
		dataType : "JSON",
		success : function(data) {
			set_line_chart(data);
		},
		error : function(jqXHR) {
			alert("发生错误！" + jqXHR);
		}
	});
}

function set_line_chart() {

	var as_linechart = echarts.init(document.getElementById('as_linechart'));

	var adminTitleCount = new Array();
	var adminTitleDate = new Array();
	for (var i = 0; i < eval(data).length; i++) {
		adminTitleCount[i] = data[i].adminTitleCount;
		adminTitleDate[i] = data[i].adminTitleDate;
	
	}
	var option = {
		title : {
			text : '资产统计折线图',
			subtext : '数量/类别'
		},
		tooltip : {
			trigger : 'axis'
		},
		xAxis : {
			type : 'category',
			boundaryGap : false,
			data : adminTitleDate
		},
		yAxis : {
			type : 'value'
		},
		series : [ {
			name : '资产数量',
			type : 'line',
			smooth : true,
			itemStyle : {
				normal : {
					color : new echarts.graphic.LinearGradient(0, 0, 0, 1, [ {
						offset : 0,
						color : '#c23531' // 0% 处的颜色
					}, {
						offset : 1,
						color : 'blue' // 100% 处的颜色
					} ], false)
				}
			},
			areaStyle : {
				normal : {
					color : new echarts.graphic.LinearGradient(0, 0, 0, 1, [ {
						offset : 1,
						color : '#c23531' // 0% 处的颜色
					}, {
						offset : 1,
						color : 'blue' // 100% 处的颜色
					} ], false)
				}
			},
			data : adminTitleCount
		} ]
	};
	as_linechart.setOption(option);
}
