function assembly_lineV1(){
    return {
        hasClima: (car) => {
            car.temp = 21;
            car.tempSettings = 21;

            car.adjustTemp = () => {
                if(car.temp < car.tempSettings){
                    car.temp++;
                }else if(car.temp > car.tempSettings){
                    car.temp--;
                }
            };
        },
        hasAudio: (car) => {
            car.currentTrack = {name: '', artist: ''};
            car.nowPlaying = () => {
                if(car.currentTrack != null){
                    console.log(`Now playing '${car.currentTrack.name}' by ${car.currentTrack.artist}`);
                }
            };
        },
        hasParktronic: (car) => {
            car.checkDistance = (distance) => {
                if(distance < 0.1){
                    console.log('Beep! Beep! Beep!');
                }else if(distance >=  0.1 && distance < 0.25){
                    console.log('Beep! Beep!');
                }else if(distance >=  0.25 && distance < 0.5){
                    console.log('Beep!');
                }else{
                    console.log('');
                }
            };
        }
    };
}

function assembly_lineV2() {
    return {
        hasClima: obj =>
            Object.assign(obj, {
                temp: 21,
                tempSettings: 21,
                adjustTemp: function () {
                    if (this.temp !== this.tempSettings) {
                        this.temp < this.tempSettings ? (this.temp += 1) : (this.temp -= 1);
                    }
                },
            }),
        hasAudio: obj =>
            Object.assign(obj, {
                currentTrack: null,
                nowPlaying: function () {
                    if (this.currentTrack !== null) {
                        console.log(`Now playing '${this.currentTrack.name} by ${this.currentTrack.artist}`);
                    }
                },
            }),
        hasParktronic: obj =>
            Object.assign(obj, {
                checkDistance: function (d) {
                    const distances = {
                        [d < 0.1]: "Beep! Beep! Beep!",
                        [0.1 <= d && d < 0.25]: "Beep! Beep!",
                        [0.25 <= d && d < 0.5]: "Beep!",
                    }

                    console.log((Object.entries(distances).find(x => x[0] === 'true') || ['true', ""])[1]);
                },
            }),
    }
}
