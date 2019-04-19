function ajaxCustomObject(type, url, data) {
	$.ajax({
		type: "POST",
		url: "/json/user/login",
		data: JSON.stringify(obj),
		dataType: "json",
		contentType: "application/json; charset=utf-8;",
		success: function (e) {
			return e;
		},
		error: function (xhr, status, error) {
			return error;
		}
	});
}
