import { expect } from "chai";

// PaymentPackage_testV1
describe('Payment Package', function() {
    it('throw error for missing parameters', () => {
        expect(() => new PaymentPackageV1('HR Services')).to.throw('Value must be a non-negative number');
    });

    it('throw error for un-proper name type', () => {
        expect(() => new PaymentPackageV1(1, 1500)).to.throw('Name must be a non-empty string');
    });

    it('throw error for empty string for name', () => {
        expect(() => new PaymentPackageV1('',100)).to.throw('Name must be a non-empty string');
    });

    it('throw error for un-proper type of value', () => {
        expect(() => new PaymentPackageV1('HR Services', 'string')).to.throw('Value must be a non-negative number');
    });

    it('throw error for negative number for value', () => {
        expect(() => new PaymentPackageV1('HR Services', -100)).to.throw('Value must be a non-negative number');
    });

    describe('getting and setting values', function() {
        it('set value to null', () => {
            let flagClass = new PaymentPackageV1('abc', 123);
            expect(flagClass.value = 0).to.equal(0);
        });
    });

    describe('VAT', function() {
        it('set VAT should throw error when the new VAT is a string', () => {
            let flagClass = new PaymentPackageV1('abc', 123);
            expect(() => flagClass.VAT = 'abc').to.throw('VAT must be a non-negative number');
        });

        it('set VAT should throw error when the new VAT is a negative number', () => {
            let flagClass = new PaymentPackageV1('abc', 123);
            expect(() => flagClass.VAT = -20).to.throw('VAT must be a non-negative number');
        });

        it('get VAT', () => {
            let flagClass = new PaymentPackageV1('abc', 123);
            expect(flagClass.VAT).to.equal(20);
        });

        it('set VAT', () => {
            let flagClass = new PaymentPackageV1('abc', 123);
            expect(flagClass.VAT = 10).to.equal(10);
        });
    });

    describe('active', function() {
        it('set active should throw error when the new value is not boolean', () => {
            let flagClass = new PaymentPackageV1('abc', 123);
            expect(() => flagClass.active = 'abc').to.throw('Active status must be a boolean');
        });

        it('get active', () => {
            let flagClass = new PaymentPackageV1('abc', 123);
            expect(flagClass.active).to.equal(true);
        });

        it('set active', () => {
            let flagClass = new PaymentPackageV1('abc', 123);
            expect(flagClass.active = false).to.equal(false);
        });
    });

    describe('toString()', function() {

        it('test toString()', () => {
            let flagClass = new PaymentPackageV1('abc', 123);
            flagClass.VAT = 30;
            flagClass.active = false;

            let output = [`Package: abc (inactive)`, `- Value (excl. VAT): 123`, `- Value (VAT 30%): 159.9`];
            expect(flagClass.toString()).to.equal(output.join('\n'));
        });
    });
});

// for judge PaymentPackage_testV1
// describe('Payment Package', function() {
//     it('throw error for missing parameters', () => {
//         expect(() => new PaymentPackage('HR Services')).to.throw('Value must be a non-negative number');
//     });
//
//     it('throw error for un-proper name type', () => {
//         expect(() => new PaymentPackage(1, 1500)).to.throw('Name must be a non-empty string');
//     });
//
//     it('throw error for empty string for name', () => {
//         expect(() => new PaymentPackage('',100)).to.throw('Name must be a non-empty string');
//     });
//
//     it('throw error for un-proper type of value', () => {
//         expect(() => new PaymentPackage('HR Services', 'string')).to.throw('Value must be a non-negative number');
//     });
//
//     it('throw error for negative number for value', () => {
//         expect(() => new PaymentPackage('HR Services', -100)).to.throw('Value must be a non-negative number');
//     });
//
//     describe('getting and setting values', function() {
//         it('set value to null', () => {
//             let flagClass = new PaymentPackage('abc', 123);
//             expect(flagClass.value = 0).to.equal(0);
//         });
//     });
//
//     describe('VAT', function() {
//         it('set VAT should throw error when the new VAT is a string', () => {
//             let flagClass = new PaymentPackage('abc', 123);
//             expect(() => flagClass.VAT = 'abc').to.throw('VAT must be a non-negative number');
//         });
//
//         it('set VAT should throw error when the new VAT is a negative number', () => {
//             let flagClass = new PaymentPackage('abc', 123);
//             expect(() => flagClass.VAT = -20).to.throw('VAT must be a non-negative number');
//         });
//
//         it('get VAT', () => {
//             let flagClass = new PaymentPackage('abc', 123);
//             expect(flagClass.VAT).to.equal(20);
//         });
//
//         it('set VAT', () => {
//             let flagClass = new PaymentPackage('abc', 123);
//             expect(flagClass.VAT = 10).to.equal(10);
//         });
//     });
//
//     describe('active', function() {
//         it('set active should throw error when the new value is not boolean', () => {
//             let flagClass = new PaymentPackage('abc', 123);
//             expect(() => flagClass.active = 'abc').to.throw('Active status must be a boolean');
//         });
//
//         it('get active', () => {
//             let flagClass = new PaymentPackage('abc', 123);
//             expect(flagClass.active).to.equal(true);
//         });
//
//         it('set active', () => {
//             let flagClass = new PaymentPackage('abc', 123);
//             expect(flagClass.active = false).to.equal(false);
//         });
//     });
//
//     describe('toString()', function() {
//
//         it('test toString()', () => {
//             let flagClass = new PaymentPackage('abc', 123);
//             flagClass.VAT = 30;
//             flagClass.active = false;
//
//             let output = [`Package: abc (inactive)`, `- Value (excl. VAT): 123`, `- Value (VAT 30%): 159.9`];
//             expect(flagClass.toString()).to.equal(output.join('\n'));
//         });
//     });
// });