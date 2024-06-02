import { expect } from "chai";
import { even_or_oddV1 } from "./_02_EvenOrOdd.js";

// even_or_odd_testV1
describe('Even or Odd', () => {
    it('should be undefined if number', () => {
        expect(even_or_oddV1(2)).to.be.undefined;
    });

    it('should be undefined if array', () => {
        expect(even_or_oddV1([])).to.be.undefined;
    });

    it('should be undefined if object', () => {
        expect(even_or_oddV1({})).to.be.undefined;
    });

    it('should return odd if string is odd', () => {
        expect(even_or_oddV1('hi!')).to.equal('odd');
    });

    it('should return even if string is even', () => {
        expect(even_or_oddV1('hi')).to.equal('even');
    });
});

// even_or_odd_testV2
describe(`Even or Odd`, () => {
    it(`inout -> (a) -> odd`, () => {
        expect(even_or_oddV1('a')).to.eq('odd');
    });

    it(`input -> aa -> even`, () => {
        expect(even_or_oddV1('aa')).to.eq('even');
    });

    it(`input -> 1 -> undefined`, () => {
        expect(even_or_oddV1(1)).to.eq(undefined);
    });

    it(`input -> [a,a] -> undefined`, () => {
        expect(even_or_oddV1(['a', 'a'])).to.eq(undefined);
    });
});

// for judge even_or_odd_testV1
/*
describe('Even or Odd', () => {
    it('should be undefined if number', () => {
        expect(isOddOrEven(2)).to.be.undefined;
    });

    it('should be undefined if array', () => {
        expect(isOddOrEven([])).to.be.undefined;
    });

    it('should be undefined if object', () => {
        expect(isOddOrEven({})).to.be.undefined;
    });

    it('should return odd if string is odd', () => {
        expect(isOddOrEven('hi!')).to.equal('odd');
    });

    it('should return even if string is even', () => {
        expect(isOddOrEven('hi')).to.equal('even');
    });
});
*/

// for judge even_or_odd_testV2
/*
describe(`Even or Odd`, () => {
    it(`inout -> (a) -> odd`, () => {
        expect(isOddOrEven('a')).to.eq('odd');
    });

    it(`input -> aa -> even`, () => {
        expect(isOddOrEven('aa')).to.eq('even');
    });

    it(`input -> 1 -> undefined`, () => {
        expect(isOddOrEven(1)).to.eq(undefined);
    });

    it(`input -> [a,a] -> undefined`, () => {
        expect(isOddOrEven(['a', 'a'])).to.eq(undefined);
    });
});
*/