// 최대 습득 가능 생일년도 
var maximumBrithday = 110;

/**
 * 생일 선택 박스 년도 동적 처리
 */
function setYear() {
	let year = new Date().getFullYear();
	let yearOptions = "<option></option>";
	for (var i = 0; i < maximumBrithday; i++) {
		let temp = (year - i);
		yearOptions += "<option value = " + temp + ">" + temp + "</option>";
	}
	$('#selectYear').empty().append(yearOptions);
}

/**
 * 생일 선택 박스 숫자 2자리수 변환
 * @param {number} num 
 * @returns {string} 2자리수 문자열
 */
function numbering(num) {
	if (num.toString().length != 2)
		return "0" + num
	return num;
}

/**
 * 생일 선택 박스 월 동적 처리
 */
function setMonth() {
	let monthOptions = "<option></option>";
	for (var i = 1; i < 13; i++) {
		monthOptions += "<option value = " + i + ">" + numbering(i)
			+ "</option>";
	}
	$('#selectMonth').empty().append(monthOptions);
}

/**
 * 윤년 계산
 * @param {number} year 
 * @param {number} month 
 * @returns {number} 해당 월의 최대 일
 */
function getLeapYear(year, month) {
	switch (month) {
		case "2":
			if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0))
				return 29;
			return 28;
		case "1":
		case "3":
		case "5":
		case "7":
		case "8":
		case "10":
		case "12":
			return 31;
		case "4":
		case "6":
		case "9":
		case "11":
			return 30;
		default:
			return 0;
	}
}

/**
 * 생일 선택 박스 일 동적 처리
 * @param {number} year 
 * @param {number} month 
 */
function setDay(year, month) {
	let days = getLeapYear(year, month);
	let dayOptions = "<option></option>";
	for (var i = 1; i <= days; i++) {
		dayOptions += "<option value = " + i + ">" + numbering(i) + "</option>";
	}
	$('#selectDate').empty().append(dayOptions);
}

(function ($) {
	setYear();

	$(document).on('change', '#selectYear', function (param) {
		// 생일 월일 선택 박스 리셋
		setMonth();
		setDay(0, 0);
	});
	$(document).on('change', '#selectMonth', function (param) {
		// 생일 일 선택 박스 리셋
		setDay($('#selectYear').val(), $('#selectMonth').val());
	});

	// 등록 처리
	$(document).on('click', '#regist', function (event) {
		if ($('#inputPassword').val() === $('#confirmPassword').val()) {
			let obj = {};
			$('form').find('input[class=form-control]').each(function () {
				if (!isEmpty(this.name)) {
					obj[this.name] = this.value;
				}
			});
			$('form').find('select[class=form-control]').each(function () {
				obj[this.name] = this.value;
			});
		} else {
			alert("비밀번호가 일치하지 않습니다.");
		}

	});
})(jQuery);
