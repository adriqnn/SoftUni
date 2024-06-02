import { expect } from 'chai';

let math_enforcerV1 = {
    addFive: function (num) {
        if (typeof(num) !== 'number') {
            return undefined;
        }

        return num + 5;
    },
    subtractTen: function (num) {
        if (typeof(num) !== 'number') {
            return undefined;
        }

        return num - 10;
    },
    sum: function (num1, num2) {
        if (typeof(num1) !== 'number' || typeof(num2) !== 'number') {
            return undefined;
        }

        return num1 + num2;
    }
};

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