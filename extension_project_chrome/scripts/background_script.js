var port = chrome.runtime.connect({action: "knockknock"});
port.postMessage({action: "Knock knock"});

port.onMessage.addListener(function(msg) {
  
    port.postMessage({answer: "Madame"});
  
});