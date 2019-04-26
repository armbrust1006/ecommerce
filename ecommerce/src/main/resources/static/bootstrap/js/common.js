
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

