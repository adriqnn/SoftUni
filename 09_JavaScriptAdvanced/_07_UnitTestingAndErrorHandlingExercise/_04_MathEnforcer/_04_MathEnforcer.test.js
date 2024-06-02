import { expect } from "chai";
import { math_enforcerV1 } from "./_04_MathEnforcer.js";

// math_enforcer_testV1
describe('Math Enforcer', function (){
    describe('addFive', function(){
        it('should return undefined for non-number input', () => {
            expect(math_enforcerV1.addFive('5')).to.equal(undefined);
        });

        it('should return correct result for possitibe integer param', () => {
            expect(math_enforcerV1.addFive(10)).to.equal(15);
        });

        it('should return correct result for negative integer param', () => {
            expect(math_enforcerV1.addFive(-5)).to.equal(0);
        });

        it('should return correct result for floating point param', () => {
            expect(math_enforcerV1.addFive(3.14)).to.be.closeTo(8.14, 0.01);
        });
    });

    describe('subtractTen', function () {
        it('should return undefined for non-number input', () => {
            expect(math_enforcerV1.subtractTen('5')).to.equal(undefined);
        });

        it('should return correct result for possitibe integer param', () => {
            expect(math_enforcerV1.subtractTen(20)).to.equal(10);
        });

        it('should return correct result for negative integer param', () => {
            expect(math_enforcerV1.subtractTen(-10)).to.equal(-20);
        });

        it('should return correct result for floating point param', () => {
            expect(math_enforcerV1.subtractTen(13.14)).to.be.closeTo(3.14, 0.01);
        });
    });

    describe('sum', function() {
        it('should return undefined for invalid first param', () => {
            expect(math_enforcerV1.sum('5', 5)).to.equal(undefined);
        });

        it('should return undefined for invalid second param', () => {
            expect(math_enforcerV1.sum(5, '5')).to.equal(undefined);
        });

        it('should return correct result for integer params', () => {
            expect(math_enforcerV1.sum(5, -4)).to.equal(1);
        });

        it('should return correct result for floating point params', () =>{
            expect(math_enforcerV1.sum(3.14, 3.14)).to.be.closeTo(6.28, 0.01);
        });
    });
});

// math_enforcer_testV2
describe(`Math Enforcer`, () => {
    describe(`testing addFive method (floats allowed range +- 0.01)`, () => {
        it(`valid input positive Integer -> (0) -> 5`, () => {
            expect(math_enforcerV1.addFive(0)).to.eq(5);
        });

        it(`valid input negative Integer -> (-1) -> 4`, () => {
            expect(math_enforcerV1.addFive(-1)).to.eq(4);
        });

        it(`valid input float -> (0.1) -> 5.1`, () => {
            expect(math_enforcerV1.addFive(0.1)).to.be.closeTo(5.1, 0.01);
        });

        it(`invalid input - not a number param -> ('a') -> undefined`, () => {
            expect(math_enforcerV1.addFive('a')).to.be.undefined;
        });
    });

    describe(`testing subtractTen method`, () => {
        it(`valid input positive Integer -> (10) -> 0`, () => {
            expect(math_enforcerV1.subtractTen(10)).to.eq(0);
        });

        it(`valid input negative Integer-> (-1) -> -11`, () => {
            expect(math_enforcerV1.subtractTen(-1)).to.eq(-11);
        });

        it(`valid input float -> (10.1) -> 0.1`, () => {
            expect(math_enforcerV1.subtractTen(10.1)).to.be.closeTo(0.1, 0.01);
        });

        it(`invalid input - not a number param -> ('a') -> undefined`, () => {
            expect(math_enforcerV1.subtractTen('a')).to.be.undefined;
        });
    });

    describe(`testing sum method`, () => {
        it(`valid input positive Integers -> (1,1) -> 2`, () => {
            expect(math_enforcerV1.sum(1, 1)).to.eq(2);
        });

        it(`valid input negative Integers-> (-1,-1) -> -2`, () => {
            expect(math_enforcerV1.sum(-1, -1)).to.eq(-2);
        });

        it(`valid input negative Int + positive Int-> (-1,1) -> 0`, () => {
            expect(math_enforcerV1.sum(-1, 1)).to.eq(0);
        });

        it(`valid input float -> (1.1,2.2) -> 3.3`, () => {
            expect(math_enforcerV1.sum(1.1, 2.2)).to.be.closeTo(3.3, 0.01);
        });

        it(`invalid input - 1st param not a number -> ('1', 1) -> undefined`, () => {
            expect(math_enforcerV1.sum('1', 1)).to.be.undefined;
        });

        it(`invalid input - 2nd paramnot not a number  -> (1, '1') -> undefined`, () => {
            expect(math_enforcerV1.sum(1, '1')).to.be.undefined;
        });
    });
});

// for judge math_enforcer_testV1
/*
describe('Math Enforcer', function (){
    describe('addFive', function(){
        it('should return undefined for non-number input', () => {
            expect(mathEnforcer.addFive('5')).to.equal(undefined);
        });

        it('should return correct result for possitibe integer param', () => {
            expect(mathEnforcer.addFive(10)).to.equal(15);
        });

        it('should return correct result for negative integer param', () => {
            expect(mathEnforcer.addFive(-5)).to.equal(0);
        });

        it('should return correct result for floating point param', () => {
            expect(mathEnforcer.addFive(3.14)).to.be.closeTo(8.14, 0.01);
        });
    });

    describe('subtractTen', function () {
        it('should return undefined for non-number input', () => {
            expect(mathEnforcer.subtractTen('5')).to.equal(undefined);
        });

        it('should return correct result for possitibe integer param', () => {
            expect(mathEnforcer.subtractTen(20)).to.equal(10);
        });

        it('should return correct result for negative integer param', () => {
            expect(mathEnforcer.subtractTen(-10)).to.equal(-20);
        });

        it('should return correct result for floating point param', () => {
            expect(mathEnforcer.subtractTen(13.14)).to.be.closeTo(3.14, 0.01);
        });
    });

    describe('sum', function() {
        it('should return undefined for invalid first param', () => {
            expect(mathEnforcer.sum('5', 5)).to.equal(undefined);
        });

        it('should return undefined for invalid second param', () => {
            expect(mathEnforcer.sum(5, '5')).to.equal(undefined);
        });

        it('should return correct result for integer params', () => {
            expect(mathEnforcer.sum(5, -4)).to.equal(1);
        });

        it('should return correct result for floating point params', () =>{
            expect(mathEnforcer.sum(3.14, 3.14)).to.be.closeTo(6.28, 0.01);
        });
    });
});
*/

// for judge math_enforcer_testV2
/*
describe(`Math Enforcer`, () => {
    describe(`testing addFive method (floats allowed range +- 0.01)`, () => {
        it(`valid input positive Integer -> (0) -> 5`, () => {
            expect(mathEnforcer.addFive(0)).to.eq(5);
        });

        it(`valid input negative Integer -> (-1) -> 4`, () => {
            expect(mathEnforcer.addFive(-1)).to.eq(4);
        });

        it(`valid input float -> (0.1) -> 5.1`, () => {
            expect(mathEnforcer.addFive(0.1)).to.be.closeTo(5.1, 0.01);
        });

        it(`invalid input - not a number param -> ('a') -> undefined`, () => {
            expect(mathEnforcer.addFive('a')).to.be.undefined;
        });
    });

    describe(`testing subtractTen method`, () => {
        it(`valid input positive Integer -> (10) -> 0`, () => {
            expect(mathEnforcer.subtractTen(10)).to.eq(0);
        });

        it(`valid input negative Integer-> (-1) -> -11`, () => {
            expect(mathEnforcer.subtractTen(-1)).to.eq(-11);
        });

        it(`valid input float -> (10.1) -> 0.1`, () => {
            expect(mathEnforcer.subtractTen(10.1)).to.be.closeTo(0.1, 0.01);
        });

        it(`invalid input - not a number param -> ('a') -> undefined`, () => {
            expect(mathEnforcer.subtractTen('a')).to.be.undefined;
        });
    });

    describe(`testing sum method`, () => {
        it(`valid input positive Integers -> (1,1) -> 2`, () => {
            expect(mathEnforcer.sum(1, 1)).to.eq(2);
        });

        it(`valid input negative Integers-> (-1,-1) -> -2`, () => {
            expect(mathEnforcer.sum(-1, -1)).to.eq(-2);
        });

        it(`valid input negative Int + positive Int-> (-1,1) -> 0`, () => {
            expect(mathEnforcer.sum(-1, 1)).to.eq(0);
        });

        it(`valid input float -> (1.1,2.2) -> 3.3`, () => {
            expect(mathEnforcer.sum(1.1, 2.2)).to.be.closeTo(3.3, 0.01);
        });

        it(`invalid input - 1st param not a number -> ('1', 1) -> undefined`, () => {
            expect(mathEnforcer.sum('1', 1)).to.be.undefined;
        });

        it(`invalid input - 2nd paramnot not a number  -> (1, '1') -> undefined`, () => {
            expect(mathEnforcer.sum(1, '1')).to.be.undefined;
        });
    });
});
*/