/**
 * 처리 결과 값 리턴 
 * @param {stirng} type 
 * @param {stirng} url 
 * @param {stirng} data
 * @returns {object} 
 */
function ajaxObj(type, url, data) {
	let resultObj = {};
	$.ajax({
		type: type,
		url: url,
		data: JSON.stringify(data),
		dataType: "json",
		async: false,
		contentType: "application/json; charset=utf-8;",
		success: function (e) {
			resultObj.key = "success";
			resultObj.value = e;
		},
		error: function (xhr, status, error) {
			resultObj.key = "error";
			resultObj.value = error;
		}
	});
	return resultObj;
}

/**
 * 특정 값 리턴
 * @param {string} type 
 * @param {string} url 
 * @returns {object}
 */
function ajaxOnlyResult(type, url) {
	let resultObj = {};
	$.ajax({
		type: type,
		url: url,
		async: false,
		contentType: "application/json; charset=utf-8;",
		success: function (e) {
			resultObj.key = "success";
			resultObj.value = e;
		},
		error: function (xhr, status, error) {
			resultObj.key = "error";
			resultObj.value = error;
		}
	});
	return resultObj;
}

/**
 * 처리 결과를 참,거짓으로 리턴
 * @param {string} type 
 * @param {string} url 
 * @param {object} data 
 * @returns {boolean}
 */
function ajaxBol(type, url, data) {
	let resultObj = {};
	$.ajax({
		type: type,
		url: url,
		data: JSON.stringify(data),
		dataType: "json",
		async: false,
		contentType: "application/json; charset=utf-8;",
		success: function (e) {
			resultObj.key = "success";
			resultObj.value = e;
		},
		error: function (xhr, status, error) {
			resultObj.key = "error";
			resultObj.value = error;
		}
	});
	return resultObj;
}

/**
 * 빈 문자열이지 판단
 * @param {string} str 
 * @returns {boolean}
 */
function isEmpty(str) {
	if (typeof str == "undefined" || str == null || str == "")
		return true;
	else
		return false;
}

/**
 * 문자열이 빈 문자열인지 체크하여 기본 문자열로 리턴한다.
 * @param {string} str 체크할 문자열
 * @param {string} defaultStr 문자열이 비어있을경우 리턴할 기본 문자열
 * @returns {string}
 */
function nvl(str, defaultStr) {
	if (typeof str == "undefined" || str == null || str == "")
		str = defaultStr;
	return str;
}
