function updateClock(){
    const now = new Date();

    let hours = now.getHours().toString().padStart(2, 0);
    const minutes = now.getMinutes().toString().padStart(2, 0);
    const seconds = now.getSeconds().toString().padStart(2, 0);

    const timeAMPM = hours >= 12 ? "PM" : "AM" ;
    let  hoursAMPM = hours % 12 || 12;

    const timeString = `${hours}:${minutes}:${seconds} - ${hoursAMPM} ${timeAMPM}`;
    document.getElementById("clock" ).textContent = timeString;
}

// setInterval(updateClock, 1000);