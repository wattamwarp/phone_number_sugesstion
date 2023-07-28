package com.example.phone_number_sugesstion

class Response(var phoneNumber:String, var statusCode:Int,var errorMessage:String  ){
    fun  Response.fromJson( map :HashMap<String,Any>){
        phoneNumber= map.get("phoneNumber") as String;
        statusCode = map.get("statusCode") as Int;
        errorMessage= map.get("errorMessage") as String;
    }
    fun  toJson() :HashMap<String,Any>{
        var  data =  HashMap<String,Any>();
        data["phoneNumber"] = phoneNumber;
        data["statusCode"] = statusCode;
        data["errorMessage"] = errorMessage;
        return data;
    }
}