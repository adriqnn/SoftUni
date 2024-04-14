function class_laptopV1(info, quality){
    class Laptop{
        constructor(info, quality){
            this.info = info;
            this.quality = quality;
            this.isOn = false;
            this.price = 800 - (info.age * 2) + (quality * 0.5);
        }

        turnOn(){
            this.isOn = true;
            this.qualityMinus();
        }

        turnOff(){
            this.isOn = false;
            this.qualityMinus();
        }

        showInfo(){
            return JSON.stringify(this.info);
        }

        qualityMinus(){
            this.quality--;
            this.price -= 0.5;
        }

        getPrice(){
            return (800 - (this.info.age * 2) + (this.quality * 0.5));
        }
    }

    return new Laptop(info, quality);
}

const class_laptopV2 = function(){
    class Laptop{
        constructor(info, quality){
            this.info = info;
            this.quality = quality;
            this.isOn = false;
            this.price = 800 - (info.age * 2) + (quality * 0.5);
        }

        turnOn(){
            this.isOn = true;
            this.qualityMinus();
        }

        turnOff(){
            this.isOn = false;
            this.qualityMinus();
        }

        showInfo(){
            return JSON.stringify(this.info);
        }

        qualityMinus(){
            this.quality--;
            this.price -= 0.5;
        }

        getPrice(){
            return (800 - (this.info.age * 2) + (this.quality * 0.5));
        }
    }

    return new Laptop(info, quality);
}

const class_laptopV3 = () => {
    class Laptop{
        constructor(info, quality){
            this.info = info;
            this.quality = quality;
            this.isOn = false;
            this.price = 800 - (info.age * 2) + (quality * 0.5);
        }

        turnOn(){
            this.isOn = true;
            this.qualityMinus();
        }

        turnOff(){
            this.isOn = false;
            this.qualityMinus();
        }

        showInfo(){
            return JSON.stringify(this.info);
        }

        qualityMinus(){
            this.quality--;
            this.price -= 0.5;
        }

        getPrice(){
            return (800 - (this.info.age * 2) + (this.quality * 0.5));
        }
    }

    return new Laptop(info, quality);
}