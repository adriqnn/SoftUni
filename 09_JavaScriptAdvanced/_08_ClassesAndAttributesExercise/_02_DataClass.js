class DataClassV1{
    method;
    uri;
    version;
    message;
    response = undefined;
    fulfilled = false;

    constructor(method, uri, version, message){
        this.message = message;
        this.method = method;
        this.uri = uri;
        this.version = version;
    }
}

class DataClassV2{
    constructor (method, uri, version, message){
        this.method = method;
        this.uri = uri;
        this.version = version;
        this.message = message;
        this.response = undefined
        this.fulfilled = false
    }
}
