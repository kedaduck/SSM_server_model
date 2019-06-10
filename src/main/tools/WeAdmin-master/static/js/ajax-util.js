var baseUrl = "http://localhost:8080/wheretoplay_war/";

var AjaxUtil = {

    options : {
        method : "get",
        url : "",
        params : {},
        type : 'json',
        callback : function(){

        },

    },

    createRequest : function(){
        var xmlHttp;
        try {
            xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
        } catch (e) {
            try {
                xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
            } catch (e) {
                try{
                    xmlHttp = new XMLHttpRequest()
                    if(xmlHttp.overrideMimeType){
                        xmlHttp.overrideMimeType("text/xml");
                    }
                }catch (e){
                    alert("您的浏览器不支持AJAX");
                }
                
            }
        }
        return xmlHttp;
    },

    setOptions : function(newOption) {
        for(var pro in newOption){
            this.options[pro] = newOption[pro];
        }
    },

    formatParameters : function(){
        var paramsArray = [];
        var params = this.options.params;
        for(var pro in params){
            var paramValue = params[pro];
            paramsArray.push(pro + "=" + paramValue);
        }
        return paramsArray.join("&");
    },

    readyStateChange : function(xmlHttp){
        var returnValue;
        if(xmlHttp.readyState == 4 && xmlHttp.status == 200){
            switch(this.options.type){
                case "xml":
                    returnValue = xmlHttp.responseXML;
                    break;
                case "json":
                    var jsonText = xmlHttp.responseText;
                    if(jsonText){
                        returnValue = eval("(" + jsonText + ")");
                    }
                    break;
                default:
                    returnValue = xmlHttp.responseText;
                    break;
            }
            if (returnValue){
                this.options.callback(returnValue);
            }else{
                this.options.callback.call(this);
            }
        }
    },
    
    request : function(options){
        var ajaxObj = this;
        ajaxObj.setOptions.call(ajaxObj, options);
        var xmlHttp = ajaxObj.createRequest.call(ajaxObj);

        xmlHttp.onreadystatechange = function(){
            ajaxObj.readyStateChange.call(ajaxObj, xmlHttp);
        };

        var formatParams = ajaxObj.formatParameters.call(ajaxObj);

        var method = ajaxObj.options.method;
        var url = baseUrl + ajaxObj.options.url;

        console.log("AJAX URL = " + url);

        if("GET" == method.toUpperCase()){
            url += "?" + formatParams;
        }

        xmlHttp.open(method, url, true);

        // if("GET" == method.toUpperCase()){
        //     xmlHttp.send();
        // }else 
        if("GET" == method.toUpperCase()){
            xmlHttp.send(null);
        }else if ("POST" == method.toUpperCase()){
            xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
            xmlHttp.send(formatParams);
        }
        


    }
}