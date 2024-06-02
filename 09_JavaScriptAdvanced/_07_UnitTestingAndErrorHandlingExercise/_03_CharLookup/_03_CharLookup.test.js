import { expect } from "chai";
import { char_lookupV1 } from './_03_CharLookup.js';

// char_lookup_testV1
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

// char_lookup_testV2
describe(`Char Lookup`, () => {
    it(`valid input -> (a, 0) -> a`, () => {
        expect(char_lookupV1('a', 0)).to.eq('a');
    });

    it(`valid input -> (ab, 1) -> b`, () => {
        expect(char_lookupV1('ab', 1)).to.eq('b');
    });

    it(`invalid input - second param not Integer -> (a, 1.1) -> undefined`, () => {
        expect(char_lookupV1('a', 1.1)).to.be.undefined;
    });

    it(`invalid input - first param not string -> (0,0) -> undefined`, () => {
        expect(char_lookupV1(0, 0)).to.be.undefined;
    });

    it(`invalid input - second param not number -> (a,a) -> undefined`, () => {
        expect(char_lookupV1('a', 'a')).to.be.undefined;
    });

    it(`invalid input - index negative -> (a,-1) -> 'Incorrect index'`, () => {
        expect(char_lookupV1('a', -1)).to.eq('Incorrect index');
    });

    it(`invalid input - index out of bounds -> (a,1) -> 'Incorrect index'`, () => {
        expect(char_lookupV1('a', 1)).to.eq('Incorrect index');
    });
});

// for judge char_lookup_testV1
/*
describe('Char Lookup', () => {
    it('check whether first parameter type is valid', () => {
        expect(lookupChar(0,0)).to.equal(undefined);
    });

    it('check whether second parameter type is valid', () => {
        expect(lookupChar('hello','test')).to.equal(undefined);
    });

    it('check whether second parameter type is valid integer', () => {
        expect(lookupChar('hello', 0.1)).to.equal(undefined);
    });

    it('check value with index bigger than string length', () => {
        expect(lookupChar('hi', 10)).to.equal('Incorrect index');
    });

    it('check value with negative index', () => {
        expect(lookupChar('hi',-10)).to.equal('Incorrect index')
    });

    it('check value with valid params', () => {
        expect(lookupChar('hello',1)).to.equal('e');
    });
});
*/

// for judge char_lookup_testV2
/*
describe(`Char Lookup`, () => {
    it(`valid input -> (a, 0) -> a`, () => {
        expect(lookupChar('a', 0)).to.eq('a');
    });

    it(`valid input -> (ab, 1) -> b`, () => {
        expect(lookupChar('ab', 1)).to.eq('b');
    });

    it(`invalid input - second param not Integer -> (a, 1.1) -> undefined`, () => {
        expect(lookupChar('a', 1.1)).to.be.undefined;
    });

    it(`invalid input - first param not string -> (0,0) -> undefined`, () => {
        expect(lookupChar(0, 0)).to.be.undefined;
    });

    it(`invalid input - second param not number -> (a,a) -> undefined`, () => {
        expect(lookupChar('a', 'a')).to.be.undefined;
    });

    it(`invalid input - index negative -> (a,-1) -> 'Incorrect index'`, () => {
        expect(lookupChar('a', -1)).to.eq('Incorrect index');
    });

    it(`invalid input - index out of bounds -> (a,1) -> 'Incorrect index'`, () => {
        expect(lookupChar('a', 1)).to.eq('Incorrect index');
    });
});
*/