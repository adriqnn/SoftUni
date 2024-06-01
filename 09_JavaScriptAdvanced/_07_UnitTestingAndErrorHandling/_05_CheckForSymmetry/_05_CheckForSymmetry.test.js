import { expect } from 'chai';
import { check_for_symmetryV1, check_for_symmetryV2 } from './_05_CheckForSymmetry.js';

// check_for_symmetry_testV1
describe('Check for Symmetry',() =>{
    it('works with symmetric numeric array', () => {
        expect(check_for_symmetryV1([1, 2, 2, 1])).to.be.true;
    });

    it('returns false for non-symmetric numeric array', () => {
        expect(check_for_symmetryV1([1, 2, 3])).to.be.false;
    });

    it('returns false for non array', () => {
        expect(check_for_symmetryV1(5)).to.be.false;
    });

    it('works with symmetric odd-length array', () =>{
        expect(check_for_symmetryV1([1, 2, 1])).to.be.true;
    });

    it('works with symmetric string array', () =>{
        expect(check_for_symmetryV1(['a', 'b', 'b', 'a'])).to.be.true;
    });

    it('returns false for string param', () => {
        expect(check_for_symmetryV1('abba')).to.be.false;
    });

    it('returns false for type mismatched params', () => {
        expect(check_for_symmetryV1([1, 2, '1'])).to.be.false;
    });
});

// check_for_symmetry_testV2
describe(`Check for Symmetry`, () => {
    it(`input -> [0,0] -> true`, () => {
        expect(check_for_symmetryV2([1, 1])).to.equal(true);
    });

    it(`input -> [0,1] -> false`, () => {
        expect(check_for_symmetryV2([0, 1])).to.equal(false);
    });

    it(`input -> 'a' -> false`, () => {
        expect(check_for_symmetryV2('')).to.equal(false);
    });

    it(`input -> [] -> true`, () => {
        expect(check_for_symmetryV2([1, 1, 1])).to.equal(true);
    });

    it(`input -> [1, '1'] -> false`, () => {
        expect(check_for_symmetryV2([1, '1'])).to.equal(false);
    });
});

// for judge check_for_symmetry_testV1
/*
describe('Symmetry Checker',() =>{
    it('works with symmetric numeric array', () => {
        expect(isSymmetric([1, 2, 2, 1])).to.be.true;
    });

    it('returns false for non-symmetric numeric array', () => {
        expect(isSymmetric([1, 2, 3])).to.be.false;
    });

    it('returns false for non array', () => {
        expect(isSymmetric(5)).to.be.false;
    });

    it('works with symmetric odd-length array', () =>{
        expect(isSymmetric([1, 2, 1])).to.be.true;
    });

    it('works with symmetric string array', () =>{
        expect(isSymmetric(['a', 'b', 'b', 'a'])).to.be.true;
    });

    it('returns false for string param', () => {
        expect(isSymmetric('abba')).to.be.false;
    });

    it('returns false for type mismatched params', () => {
        expect(isSymmetric([1, 2, '1'])).to.be.false;
    });
});
*/

// for judge check_for_symmetry_testV2
/*
describe(`check if array is symmetric`, () => {
    it(`input -> [0,0] -> true`, () => {
        expect(isSymmetric([1, 1])).to.equal(true);
    });

    it(`input -> [0,1] -> false`, () => {
        expect(isSymmetric([0, 1])).to.equal(false);
    });

    it(`input -> 'a' -> false`, () => {
        expect(isSymmetric('')).to.equal(false);
    });

    it(`input -> [] -> true`, () => {
        expect(isSymmetric([1, 1, 1])).to.equal(true);
    });

    it(`input -> [1, '1'] -> false`, () => {
        expect(isSymmetric([1, '1'])).to.equal(false);
    });
});
*/
