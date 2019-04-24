/**
 * 로그인 판단 후 페이지 전환 메세지
 */
async function alertLogin() {
	let message = await ajaxOnlyResult("POST", "/loginCheck");
	if (message !== undefined && message.key == "success" &&
		!isEmpty(message.value)) {
		if (!confirm(message.value)) {
			location.href = "/index";
		}
	}
}

(function ($) {
	alertLogin();

	// 로그인 버튼 클릭 이벤트 
	$(document).on('click', '#loginBtn', function (event) {
		$('form').submit();
	});
})(jQuery);
