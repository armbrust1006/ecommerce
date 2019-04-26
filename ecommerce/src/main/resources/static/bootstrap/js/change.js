var jsonPath = '/static/json/text.json';
var countNum = 5;

(function ($) {
    $.getJSON(jsonPath, function (data) {
        let text = data.defaultMessage;
        text.replace("{{page}}", data.pageName);
        $('#pageName').text(text);
    });

    setInterval(() => {
        $('#countNum').text(countNum--);
    }, 1000);
})(jQuery);
