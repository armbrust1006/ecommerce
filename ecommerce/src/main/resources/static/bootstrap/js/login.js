function alertLogin() {
	let message = "${loginChecker}";
	if (message != null) {
		alert(message);
	}
}

(function($) {
	alertLogin();

	$(document).on('click', '#loginBtn', function(event) {
		$('form').submit();
	});

})(jQuery);
