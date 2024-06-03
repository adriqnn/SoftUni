import { expect } from 'chai';

function char_lookupV1(string, index){
    if (typeof(string) !== 'string' || !Number.isInteger(index)){
        return undefined;
    }

    if (string.length <= index || index < 0){
        return "Incorrect index";
    }

    return string.charAt(index);
}

describe('Char Lookup', () => {
    it('check whether first parameter type is valid', () => {
        expect(char_lookupV1(0,0)).to.equal(undefined);
    });

    it('check whether second parameter type is valid', () => {
        expect(char_lookupV1('hello','test')).to.equal(undefined);
    });

    it('check whether second parameter type is valid integer', () => {
        expect(char_lookupV1('hello', 0.1)).to.equal(undefined);
    });

    it('check value with index bigger than string length', () => {
        expect(char_lookupV1('hi', 10)).to.equal('Incorrect index');
    });

    it('check value with negative index', () => {
        expect(char_lookupV1('hi',-10)).to.equal('Incorrect index')
    });

    it('check value with valid params', () => {
        expect(char_lookupV1('hello',1)).to.equal('e');
    });
});
