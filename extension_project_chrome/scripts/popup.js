//sends user cookie, user_id, every 1hr, if the website is on bitcointalk and SMF cookie is set ... when reloaded, or switches tab to bitcointalk.
//once data is sent, gets info such as whether the account has been frozen,
//
//
//
chrome.runtime.onMessage.addListener(function(request, sender, sendResponse) {
 //console.log(request);
  });



//freeze click events
window.onload = function(){
$('#freeze').on("click", function(){
	var message  = {action:"togglefreeze", message:null};
	console.log(sendMessage(message));
});

setTitle("knightdk");



 $('#bs-example-navbar-collapse-2')
        .on('show.bs.collapse', function (e) {
            $('body').addClass('menu-slider');
        })
        .on('shown.bs.collapse', function (e) {
            $('body').addClass('in');
        })
        .on('hide.bs.collapse', function (e) {
            $('body').removeClass('menu-slider');
        })
        .on('hidden.bs.collapse', function (e) {
            $('body').removeClass('in');
        });
		
		
		
}



var setTitle = function(title){
	$("#display_name").text(title);
	if(title.length > 14){
		var title_replace = title.substr(0, 13);
		$("#display_name").text(title_replace+"...");
	}
}
//send messages
var sendMessage = function(message){
		chrome.tabs.query({active: true, currentWindow: true}, function(tabs){
    chrome.tabs.sendMessage(tabs[0].id,message, function(response) {
		//no response
	});  
}); }

