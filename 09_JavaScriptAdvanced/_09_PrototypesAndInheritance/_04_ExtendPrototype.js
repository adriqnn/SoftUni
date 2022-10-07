function extendPrototype(classDeff){
    classDeff.prototype.species = 'Human';
    classDeff.prototype.toSpeciesString = function(){
        return `I am a ${this.species}. ${this.toString()}`;
    }
}