/**
 * 
 */
function loginBtn() {
    let obj = {};
    $("#form").find("input[class=form-control]").each(function(){
        let key = this.name;
        obj[key] = this.value;
    });

    $.ajax({
		type:"POST",
		url:"/json/user/login",
		data : JSON.stringify(obj),
        dataType : "json",
        contentType: "application/json; charset=utf-8;",
		success: function(e){
			console.log(e);
		},
		error: function(xhr, status, error) {
			alert(error);
		}	
	});
}
