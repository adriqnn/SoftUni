function extend_prototypeV1(definedClass){
    definedClass.prototype.species = 'Human';

    definedClass.prototype.toSpeciesString = function(){
        return `I am a ${this.species}. ${this.toString()}`;
    }
}
