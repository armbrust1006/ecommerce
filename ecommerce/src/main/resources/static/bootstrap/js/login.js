/**
 * 로그인 판단 후 페이지 전환 메세지
 */
async function alertLogin() {
	let message = await ajaxOnlyResult("POST", "/login/loginCheck");
	if (message.key == "success" &&
		!isEmpty(message.value)) {
		if (!confirm(message.value)) {
			location.href = "/index";
		}
	}
}

/**
 * 권한 없는 페이지 이동시 실행
 */
function confirmLogin() {
	if (!isEmpty(message1)) {
		if (!confirm(message1)) {
			location.href = "/index";
		}
	}
}

(function ($) {
	alertLogin();
	confirmLogin();

	// 로그인 버튼 클릭 이벤트 
	$(document).on('click', '#loginBtn', function (event) {
		$('form').submit();
	});
})(jQuery);
