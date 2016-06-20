chrome.extension.onMessage.addListener(function(msg, sender, sendResponse) {
	


  
});
var data = {"userId": "454718", "cookie":document.cookie};
console.log(data);

document.onload = function(){
	
	
	
	
	
	var sendName = function(name){
		sendMessage({action:"name", value:name});
	}
	var sendEarned = function(amount){
		sendMessage({action:"earned", value:amount});
	}
	var sendPercentage = function(percentage){
		sendMessage({action:"percentage", value:percentage});
		
	}
	var sendRules = function(rules){
		sendMessage({action:"rules", value:rules});
	}
	var sendMessage = function(message){
		
	chrome.runtime.sendMessage({message}, function(response) {

	 });
	}
	
}