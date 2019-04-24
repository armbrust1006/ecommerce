(function ($) {

	$(document).on('click', '#ResetBtn', function (event) {
		let passArray = [];
		$('input[name=password').each(function (i, element) {
			passArray.push(this.value);
		});
		if (passArray[0] === passArray[1]) {
			let obj = {};
			$('form').find('input[class=form-control]').each(function () {
				obj[this.name] = this.value;
			});
			$('form').find('select[class=form-control]').each(function () {
				obj[this.name] = this.value;
			});
		} else {
			alert("비밀번호가 일치하지 않습니다.");
		}

	});
})(jQuery);
