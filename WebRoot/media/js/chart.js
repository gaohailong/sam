//资产统计
function as_linechart() {
	$.ajax({
		type : "GET",
		url : "/sam/chart/findLineChart",
		dataType : "JSON",
		success : function(data) {
			set_asset_line_chart(data);
			set_asset_pie_chart(data);
			set_asset_radar_chart(data);
		},
		error : function(jqXHR) {
			alert("发生错误！" + jqXHR);
		}
	});
}

function set_asset_line_chart(data) {
	var as_linechart = echarts.init(document.getElementById('as_linechart'));
	var assetCount = new Array();
	var assetCategory = new Array();
	for (var i = 0; i < eval(data).length; i++) {
		assetCount[i] = data[i].assetCount;
		assetCategory[i] = data[i].assetCategory;
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
			data : assetCategory
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
						color : '#35b5b0' // 0% 处的颜色
					}, {
						offset : 1,
						color : '#35b5b0' // 100% 处的颜色
					} ], false)
				}
			},
			areaStyle : {
				normal : {
					color : new echarts.graphic.LinearGradient(0, 0, 0, 1, [ {
						offset : 1,
						color : '#35B5B0' // 0% 处的颜色
					}, {
						offset : 1,
						color : '#35B5B0' // 100% 处的颜色
					} ], false)
				}
			},
			data : assetCount
		} ]
	};
	as_linechart.setOption(option);
}

function set_asset_pie_chart(piedata) {

	var pieValueArray = new Array();
	for (var i = 0; i < eval(piedata).length; i++) {
		pieValueArray[i] = new Chart(piedata[i].assetCount,
				piedata[i].assetCategory);
	}

	var as_piechart = echarts.init(document.getElementById('as_piechart'));

	var option = {
		backgroundColor : '#fafafa',

		title : {
			text : '饼状图',
			left : 'center',
			top : 20,
			textStyle : {
				color : '#3f3f3f'
			}
		},

		tooltip : {
			trigger : 'item',
			formatter : "{a} <br/>{b} : {c} ({d}%)"
		},

		visualMap : {
			show : false,
			min : 80,
			max : 600,
			inRange : {
				colorLightness : [ 0, 1 ]
			}
		},
		series : [ {
			name : '',
			type : 'pie',
			radius : '55%',
			center : [ '50%', '50%' ],
			data : pieValueArray,
			roseType : 'angle',
			label : {
				normal : {
					textStyle : {
						color : 'rgba(63, 63, 63, 1)'
					}
				}
			},
			labelLine : {
				normal : {
					lineStyle : {
						color : 'rgba(63, 63, 63, 1)'
					},
					smooth : 0.2,
					length : 10,
					length2 : 20
				}
			},
			itemStyle : {
				normal : {
					color : '#000000',
					shadowBlur : 200,
					shadowColor : 'rgba(0, 0, 0, 0.5)'
				}
			}
		} ]
	};
	as_piechart.setOption(option);
}

// 数量对应的资产类别
function set_asset_radar_chart(radardata) {
	var dataNum = new Array();
	var indicator2 = new Array();
	var max = 0;
	// 判断最大值
	for (var i = 0; i < eval(radardata).length; i++) {
		if (radardata[i].assetCount > max) {
			max = radardata[i].assetCount * 1;
		}
	}
	for (var i = 0; i < eval(radardata).length; i++) {
		dataNum[i] = radardata[i].assetCount;
		indicator2[i] = new ChartRadar(radardata[i].assetCategory, max * 2);
	}
	var dataCate = [ dataNum ];
	var as_radarchart = echarts.init(document.getElementById("as_radarchart"));
	var lineStyle = {
		normal : {
			width : 1,
			opacity : 0.5
		}
	};
	var option = {
		backgroundColor : '#fafafa',
		title : {
			text : '资产数量 - 雷达图',
			left : 'center',
			textStyle : {
				color : '#0B0B0B'
			}
		},
		radar : {
			indicator : indicator2,
			shape : 'circle',
			splitNumber : 5,
			name : {
				textStyle : {
					color : 'rgb(11, 11, 11)'
				}
			},
			splitLine : {
				lineStyle : {
					color : [ 'rgba(11, 11, 11, 0.5)', 'rgba(11, 11, 11, 0.2)',
							'rgba(11, 11, 11, 0.3)', 'rgba(11, 11, 11, 0.3)',
							'rgba(11, 11, 11, 0.1)', 'rgba(11, 11, 11, 0.1)' ]
							.reverse()
				}
			},
			splitArea : {
				show : false
			},
			axisLine : {
				lineStyle : {
					color : 'rgba(11, 11, 11, 0.5)'
				}
			}
		},
		series : [ {
			type : 'radar',
			lineStyle : lineStyle,
			data : dataCate,
			symbol : 'none',
			itemStyle : {
				normal : {
					color : '#0b0b0b'
				}
			},
			areaStyle : {
				normal : {
					opacity : 0.1
				}
			}
		} ]
	};
	as_radarchart.setOption(option);
}

// 图表实体类
function Chart(value, name) {
	this.value = value;
	this.name = name;
}

// 雷达图实体类
function ChartRadar(name, max) {
	this.name = name;
	this.max = max;
}

// 资产统计
function as_house_linechart() {
	$.ajax({
		type : "GET",
		url : "/sam/chart/findHouseLineChart",
		dataType : "JSON",
		success : function(data) {
			set_asset_house_line_chart(data);
		},
		error : function(jqXHR) {
			alert("发生错误！" + jqXHR);
		}
	});
}

// 仓库折线图
function set_asset_house_line_chart(housedata) {
	var as_house_linechart = echarts.init(document
			.getElementById('as_house_linechart'));
	var max = 0;
	var countArray=new Array();
	var houseArray=new Array();
	// 判断最大值
	for (var i = 0; i < eval(housedata).length; i++) {
		if (housedata[i].assetCount > max) {
			max = housedata[i].assetCount;
		}
		countArray[i]=housedata[i].assetCount;
		houseArray[i]=housedata[i].assetHouse;
	}

	var dataAxis = houseArray;
	var data = countArray;
	var yMax = max;
	var dataShadow = [];

	for (var i = 0; i < data.length; i++) {
		dataShadow.push(yMax);
	}

	var option = {
		title : {
			text : '仓库-数量柱形图',
			subtext : ''
		},
		xAxis : {
			data : dataAxis,
			axisLabel : {
				inside : true,
				textStyle : {
					color : '#fff'
				}
			},
			axisTick : {
				show : false
			},
			axisLine : {
				show : false
			},
			z : 10
		},
		yAxis : {
			axisLine : {
				show : false
			},
			axisTick : {
				show : false
			},
			axisLabel : {
				textStyle : {
					color : '#999'
				}
			}
		},
		dataZoom : [ {
			type : 'inside'
		} ],
		series : [ { // For shadow
			type : 'bar',
			itemStyle : {
				normal : {
					color : 'rgba(0,0,0,0.05)'
				}
			},
			barGap : '-100%',
			barCategoryGap : '40%',
			data : dataShadow,
			animation : false
		}, {
			type : 'bar',
			itemStyle : {
				normal : {
					color : new echarts.graphic.LinearGradient(0, 0, 0, 1, [ {
						offset : 0,
						color : '#83bff6'
					}, {
						offset : 0.5,
						color : '#188df0'
					}, {
						offset : 1,
						color : '#188df0'
					} ])
				},
				emphasis : {
					color : new echarts.graphic.LinearGradient(0, 0, 0, 1, [ {
						offset : 0,
						color : '#2378f7'
					}, {
						offset : 0.7,
						color : '#2378f7'
					}, {
						offset : 1,
						color : '#83bff6'
					} ])
				}
			},
			data : data
		} ]
	};

	as_house_linechart.setOption(option);
}
