function class_vehicleV1(type, model, parts, fuel){
    class Vehicle{
        constructor(type, model, parts, fuel){
            this.type = type;
            this.model = model;
            this.parts = {...parts, quality: parts["engine"] * parts["power"]};
            this.fuel = fuel;
        }

        drive(f){
            this.fuel -= f;
        }
    }

    return new Vehicle(type, model, parts, fuel);
}

const class_vehicleV2 = function(type, model, parts, fuel){
    class Vehicle{
        constructor(type, model, parts, fuel){
            this.type = type;
            this.model = model;
            this.parts = {...parts, quality: parts["engine"] * parts["power"]};
            this.fuel = fuel;
        }

        drive(f){
            this.fuel -= f;
        }
    }

    return new Vehicle(type, model, parts, fuel);
}

const class_vehicleV3 = (type, model, parts, fuel) => {
    class Vehicle{
        constructor(type, model, parts, fuel){
            this.type = type;
            this.model = model;
            this.parts = {...parts, quality: parts["engine"] * parts["power"]};
            this.fuel = fuel;
        }

        drive(f){
            this.fuel -= f;
        }
    }

    return new Vehicle(type, model, parts, fuel);
}