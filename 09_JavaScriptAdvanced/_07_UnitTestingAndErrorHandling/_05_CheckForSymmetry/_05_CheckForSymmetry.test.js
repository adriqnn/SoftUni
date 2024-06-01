import { expect } from 'chai';
import { check_for_symmetryV1 } from './_05_CheckForSymmetry.js';

describe('Symmetry Checker',() =>{
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