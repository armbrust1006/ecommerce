function ajaxCustomObject(type, url, data) {
	let resultObj = {};
	$.ajax({
		type : type,
		url : url,
		data : JSON.stringify(data),
		dataType : "json",
		contentType : "application/json; charset=utf-8;",
		success : function(e) {
			resultObj.key = "success";
			resultObj.value = e;
			return resultObj;
		},
		error : function(xhr, status, error) {
			resultObj.key = "error";
			resultObj.value = error;
			return resultObj;
		}
	});
}
