(function ($) {
	$(document).on('click', '#year', function (param) {
		
	});
	$(document).on('click', '#month', function (param) {

	});
	$(document).on('click', '#date', function (param) {

	});

	$(document).on('click', '#regist', function (event) {
		let obj = {};
		$("form").find("input[class=form-control]").each(function () {
			obj[this.id] = this.value;
		});

		$.ajax({
			type: "POST",
			url: "/json/user/regist",
			data: JSON.stringify(obj),
			dataType: "json",
			contentType: "application/json; charset=utf-8;",
			success: function (e) {
				console.log(e);
			},
			error: function (xhr, status, error) {
				alert(error);
			}
		});
	});
})(jQuery); // End of use strict