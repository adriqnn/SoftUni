import { expect } from 'chai';
import { add_subtractV1 } from './_07_AddSubtract.js';

// add_subtract_testV1
describe('Add Subtract', () => {
    it ('check whether it returns properties are functions', () => {
        expect(typeof add_subtractV1().add).to.equal('function');
        expect(typeof add_subtractV1().subtract).to.equal('function');
        expect(typeof add_subtractV1().get).to.equal('function');
    });

    it ('check if add and subtract calculate properly', () => {
        let calc = add_subtractV1();
        calc.add('5');
        expect(calc.get()).to.equal(5);
    });

    it ('check if add and subtract get only numbers', () => {
        let calc = add_subtractV1();
        calc.add('g');
        expect(calc.get()).to.be.NaN;
    });

    it ('value cant be changed', () => {
        let calc = add_subtractV1();
        expect(calc.value += 4).to.be.NaN;
    });

    it ('value cant be accessed', () => {
        let calc = add_subtractV1();
        expect(calc.value).to.be.undefined;
    });

    it ('returns an object', () => {
        let calc = add_subtractV1();
        expect(calc).to.be.a('object');
    });
});

// add_subtract_testV2
describe(`Add Subtract`, () => {
    it(`returns an object`, () => {
        expect(typeof add_subtractV1()).to.equals('object');
    });

    it(`return obj has method add`, () => {
        expect(add_subtractV1().add()).to.equals('yes');
    });

    it(`return obj has method subtract`, () => {
        expect(typeof add_subtractV1().subtract).to.equals('function');
    });

    it(`return obj has method get`, () => {
        expect(typeof add_subtractV1().get).to.equals('function');
    });

    it(`internal sum cannot be modified`, () => {
        expect(add_subtractV1().value).to.equals(undefined);
    });

    it(`add method adds parsable input`, () => {
        const calc = add_subtractV1();
        calc.add('1');
        expect(calc.get()).to.equals(1);
    });

    it(`subtract method subtracts parsable input`, () => {
        const calc = add_subtractV1();
        calc.add('2');
        calc.subtract('1');
        expect(calc.get()).to.equals(1);
    });
});

// for judge add_subtract_testV1
/*
describe('Add Subtract', () => {
    it ('check whether it returns properties are functions', () => {
        expect(typeof createCalculator().add).to.equal('function');
        expect(typeof createCalculator().subtract).to.equal('function');
        expect(typeof createCalculator().get).to.equal('function');
    });

    it ('check if add and subtract calculate properly', () => {
        let calc = createCalculator();
        calc.add('5');
        expect(calc.get()).to.equal(5);
    });

    it ('check if add and subtract get only numbers', () => {
        let calc = createCalculator();
        calc.add('g');
        expect(calc.get()).to.be.NaN;
    });

    it ('value cant be changed', () => {
        let calc = createCalculator();
        expect(calc.value += 4).to.be.NaN;
    });

    it ('value cant be accessed', () => {
        let calc = createCalculator();
        expect(calc.value).to.be.undefined;
    });

    it ('returns an object', () => {
        let calc = createCalculator();
        expect(calc).to.be.a('object');
    });
});
*/

// for judge add_subtract_testV2
/*
describe(`Add Subtract`, () => {
    it(`returns an object`, () => {
        expect(typeof createCalculator()).to.equals('object');
    });

    it(`return obj has method add`, () => {
        expect(createCalculator().add()).to.equals('yes');
    });

    it(`return obj has method subtract`, () => {
        expect(typeof createCalculator().subtract).to.equals('function');
    });

    it(`return obj has method get`, () => {
        expect(typeof createCalculator().get).to.equals('function');
    });

    it(`internal sum cannot be modified`, () => {
        expect(createCalculator().value).to.equals(undefined);
    });

    it(`add method adds parsable input`, () => {
        const calc = createCalculator();
        calc.add('1');
        expect(calc.get()).to.equals(1);
    });

    it(`subtract method subtracts parsable input`, () => {
        const calc = createCalculator();
        calc.add('2');
        calc.subtract('1');
        expect(calc.get()).to.equals(1);
    });
});
*/