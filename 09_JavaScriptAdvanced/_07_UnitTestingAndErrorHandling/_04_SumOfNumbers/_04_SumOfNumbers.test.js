import { expect } from 'chai';
import { sum_of_numbersV1 } from './_04_SumOfNumbers.js';

// sum_of_numbers_testV1
describe('Sum of Numbers', () => {
    it ('works with array of numbers', () => {
        expect(sum_of_numbersV1([2, 2, 1])).to.equal(5);
    });

    it ('works with negative numbers', () => {
        expect(sum_of_numbersV1([-1, -3, 5])).to.equal(1);
    });

    it ('works with one number', () => {
        expect(sum_of_numbersV1([0])).to.equal(0);
    });
});

// sum_of_numbers_testV2
describe('Sum of Numbers', () => {
    it('return NaN if one element of array is not a number', () => {
        expect(isNaN(sum_of_numbersV1([1, 'a']))).to.equal(true);
    });

    it('calculates 1 element array', () => {
        expect(sum_of_numbersV1([1])).to.equal(1);
    });

    it('calculates 2 element array', () => {
        expect(sum_of_numbersV1([1, 1])).to.equal(2);
    });
});

// for judge sum_of_numbers_testV1
/*
describe('Sum of Numbers', () => {
    it ('works with array of numbers', () => {
        expect(sum([2, 2, 1])).to.equal(5);
    });

    it ('works with negative numbers', () => {
        expect(sum([-1, -3, 5])).to.equal(1);
    });

    it ('works with one number', () => {
        expect(sum([0])).to.equal(0);
    });
});
*/

// for judge sum_of_numbers_testV2
/*
describe('Sum of Numbers', () => {
    it('return NaN if one element of array is not a number', () => {
        expect(isNaN(sum([1, 'a']))).to.equal(true);
    });

    it('calculates 1 element array', () => {
        expect(sum([1])).to.equal(1);
    });

    it('calculates 2 element array', () => {
        expect(sum([1, 1])).to.equal(2);
    });
});
*/
