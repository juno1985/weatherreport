$(function(){
	$('#selectCityId').change(function(){
		var cityName = $('#selectCityId').val();
		var url = '/weather/report/cityName/' + cityName;
		//页面跳转
		window.location.href = url;
	});
});