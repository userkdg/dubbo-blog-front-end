/**
 * 跳转页面--统一方法
 */
function toPage(id){
	window.location.href=BASE_PATH+"/page/"+id;
}
/**
 * 不带参数的跳转
 * @param dir1
 * @param dir2
 * @param dir3
 */
function toPages(dir1,dir2,dir3){
	var URL = BASE_PATH+"/page";
	if(dir1){
		URL += "/" + dir1;
	}
	if(dir2){
		URL += "/" + dir2;
	}
	if(dir3){
		URL += "/" + dir3;
	}
	window.location.href = URL;
}
function toUserPage(id){
	window.location.href=BASE_PATH+"/page/user/"+id;
}
function userLogin(){
	window.location.href=BASE_PATH+"/page/login";
}
function userRegister(){
	window.location.href=BASE_PATH+"/page/register";
}
/**
 * 注：只适用于layui中的提交
 * 用于form表单提交的layui.use()内部的提交
 * ajax2save('submitFt',['username','password']);
 * @filterId	eg:lay-filter='filterId'
 * @validArr eg:['field1','field2',...]/{'field','field2'..}
 * @author kdg
 **/
function ajax2save1(filterId,validArr,url){
	var filterId = "submit("+filterId+")";

	form.on(filterId,function(data){
		var json = JSON.stringify(data.field);

		//var jsonObj = JSON.parse(json);
		var isYes = false;

		/**$.each(validArr,function(e){
			if(!jsonObj.e){
				isYes = layer.alert('<span>必填项尚未填写完全！！</span><i class="layui-icon">&#xe69c;</i>');
			}
		});
		if(isYes)
			return false;*/
		layer.msg(json);
		$.ajax({
			url:url,
			type:'POST',
			dataType:'json',
			contentType:'application/json;charset=utf-8',
			data:json,
			success:function(text){
				layer.msg(text);
			},
			error:function(error){
				layer.msg(error);
			}
		});
		//return true;
	});
}
/**
 * 注：var layer="";必须要全局才可以使用layer.msg()...
 * @filterId eg:lay-filter='filterId'
 * @url eg:'${basePath}/user/createUser'
 */
function ajax2save2(filterId,url){
	var filterId = "submit("+filterId+")";
	form.on(filterId,function(data){
		var json = JSON.stringify(data.field);

		layer.msg(json);
		$.ajax({
			url:url,
			type:'POST',
			dataType:'json',
			contentType:'application/json;charset=utf-8',
			data:json,
			success:function(text){
				layer.msg(text);
			},
			error:function(error){
				layer.msg(error);
			}
		});
	});
	//return true;
}

/**
 * 用于提交表单
 *将serializaArray()的json对象转为json字符串格式
 * [{name:'1',value:'23'},{...}]--------->[{'name':'1','value':'23'},{...}]
 * @returns {{}}
 */
$.fn.serializeObject = function(){
    var o = {};
    var a = this.serializeArray();
    $.each(a, function() {
        if (o[this.name]) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];

            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
};
/**
 * setForm()函数，用于加载表单数据是用到
 * setForm()--> @Param jsonValue是json字符串
 * JSON.parse(jsonValue); JSON.stringify(jsonObj);
 */
$.fn.extend({
    //表单加载json对象数据
    setForm: function (jsonValue) {
        var obj = this;
        $.each(jsonValue, function (name, ival) {
            var $oinput = obj.find("input[name=" + name + "]");
            if ($oinput.attr("type") == "checkbox") {
                if (ival !== null) {
                    var checkboxObj = $("[name=" + name + "]");
                    var checkArray = ival.split(";");
                    for (var i = 0; i < checkboxObj.length; i++) {
                        for (var j = 0; j < checkArray.length; j++) {
                            if (checkboxObj[i].value == checkArray[j]) {
                                checkboxObj[i].click();
                            }
                        }
                    }
                }
            }
            else if ($oinput.attr("type") == "radio") {
                $oinput.each(function () {
                    var radioObj = $("[name=" + name + "]");
                    for (var i = 0; i < radioObj.length; i++) {
                        if (radioObj[i].value == ival) {
                            radioObj[i].click();
                        }
                    }
                });
            }
            else if ($oinput.attr("type") == "textarea") {
                obj.find("[name=" + name + "]").html(ival);
            }
            else {
                obj.find("[name=" + name + "]").val(ival);
            }
        })

    }
});