function browser_historyV1(object, array){
    let browserName = object["Browser Name"];
    let openTabs = object["Open Tabs"];
    let recentlyClosedTabs = object["Recently Closed"];
    let browserLogs = object["Browser Logs"];

    let result = `${browserName}\n`;

    array.forEach(e => {
        let [command, site] = e.split(" ");

        if(command === "Open"){
            openTabs.push(site);
            browserLogs.push(e);
        }else if(command === "Close"){
            if(openTabs.includes(site)){
                openTabs = openTabs.filter(e => e !== site);
                recentlyClosedTabs.push(site);
                browserLogs.push(e);
            }
        }else if(command === "Clear"){
            openTabs = [];
            recentlyClosedTabs = [];
            browserLogs = [];
        }
    });

    return result += `Open Tabs: ${openTabs.join(", ")}\nRecently Closed: ${recentlyClosedTabs.join(", ")}\nBrowser Logs: ${browserLogs.join(", ")}`;
}

const browser_historyV2 = function(object, array){
    let browserName = object["Browser Name"];
    let openTabs = object["Open Tabs"];
    let recentlyClosedTabs = object["Recently Closed"];
    let browserLogs = object["Browser Logs"];

    let result = `${browserName}\n`;

    array.forEach(e => {
        let [command, site] = e.split(" ");

        if(command === "Open"){
            openTabs.push(site);
            browserLogs.push(e);
        }else if(command === "Close"){
            if(openTabs.includes(site)){
                openTabs = openTabs.filter(e => e !== site);
                recentlyClosedTabs.push(site);
                browserLogs.push(e);
            }
        }else if(command === "Clear"){
            openTabs = [];
            recentlyClosedTabs = [];
            browserLogs = [];
        }
    });

    return result += `Open Tabs: ${openTabs.join(", ")}\nRecently Closed: ${recentlyClosedTabs.join(", ")}\nBrowser Logs: ${browserLogs.join(", ")}`;
}

const browser_historyV3 = (object, array) => {
    let browserName = object["Browser Name"];
    let openTabs = object["Open Tabs"];
    let recentlyClosedTabs = object["Recently Closed"];
    let browserLogs = object["Browser Logs"];

    let result = `${browserName}\n`;

    array.forEach(e => {
        let [command, site] = e.split(" ");

        if(command === "Open"){
            openTabs.push(site);
            browserLogs.push(e);
        }else if(command === "Close"){
            if(openTabs.includes(site)){
                openTabs = openTabs.filter(e => e !== site);
                recentlyClosedTabs.push(site);
                browserLogs.push(e);
            }
        }else if(command === "Clear"){
            openTabs = [];
            recentlyClosedTabs = [];
            browserLogs = [];
        }
    });

    return result += `Open Tabs: ${openTabs.join(", ")}\nRecently Closed: ${recentlyClosedTabs.join(", ")}\nBrowser Logs: ${browserLogs.join(", ")}`;
}