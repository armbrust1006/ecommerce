var maximumBrithday = 110;

function setYear() {
	let year = new Date().getFullYear();
	let yearOptions = "<option></option>";
	for (var i = 0; i < maximumBrithday; i++) {
		let temp = (year - i);
		yearOptions += "<option value = " + temp + ">" + temp + "</option>";
	}
	$('#selectYear').empty().append(yearOptions);
}

function numbering(num) {
	if (num.toString().length != 2)
		return "0" + num
	return num;
}

function setMonth() {
	let monthOptions = "<option></option>";
	for (var i = 1; i < 13; i++) {
		monthOptions += "<option value = " + i + ">" + numbering(i)
				+ "</option>";
	}
	$('#selectMonth').empty().append(monthOptions);
}

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

function setDay(year, month) {
	let days = getLeapYear(year, month);
	let dayOptions = "<option></option>";
	for (var i = 1; i <= days; i++) {
		dayOptions += "<option value = " + i + ">" + numbering(i) + "</option>";
	}
	$('#selectDate').empty().append(dayOptions);
}

(function($) {
	setYear();

	$(document).on('change', '#selectYear', function(param) {
		setMonth();
		setDay(0, 0);
	});
	$(document).on('change', '#selectMonth', function(param) {
		setDay($('#selectYear').val(), $('#selectMonth').val());
	});

	$(document).on('click', '#regist', function(event) {
		let passArray = [];
		$('input[name=password').each(function(i, element) {
			passArray.push(this.value);
		});
		if (passArray[0] === passArray[1]) {
			let obj = {};
			$('form').find('input[class=form-control]').each(function() {
				obj[this.name] = this.value;
			});
			$('form').find('select[class=form-control]').each(function() {
				obj[this.name] = this.value;
			});

			$.ajax({
				type : "POST",
				url : "/json/membership/regist",
				data : JSON.stringify(obj),
				dataType : "json",
				contentType : "application/json; charset=utf-8;",
				success : function(e) {
					console.log(e);
				},
				error : function(xhr, status, error) {
					console.log(error);
				}
			});

			/*
			 * let result = ajaxCustomObject("POST", "/json/membership/regist",
			 * obj);
			 */
		} else {
			alert("비밀번호 불일치");
		}

	});
})(jQuery); // End of use strict
